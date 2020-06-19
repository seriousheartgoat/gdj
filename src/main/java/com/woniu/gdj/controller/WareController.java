package com.woniu.gdj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Merchartorder;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.Wareinventory;
import com.woniu.gdj.service.*;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import com.woniu.gdj.entity.Checkentry;
import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.entity.Warespec;
import com.woniu.gdj.service.WareService;
import com.woniu.gdj.service.WareclassificationtypeService;
import com.woniu.gdj.service.WarespecService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/ware")
public class WareController {
    @Resource
    WareService wareService;
    @Resource
    WareclassificationtypeService wareclassificationtypeService;
    @Resource
    WarespecService warespecService;

    @GetMapping("getAllWare")
    public Map<String,Object> getAllWare(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Ware> warelist = wareService.findAll();
        map.put("warelist",warelist);
        map.put("msg",true);
        return map;
    }

    @GetMapping("getAllWareType")
    public Map<String,Object> getAllWareType(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Wareclassificationtype> wareTypelist = wareclassificationtypeService.findAll();
        map.put("wareTypelist",wareTypelist);
        map.put("msg",true);
        return map;
    }

    @GetMapping("getAllWareSpec")
    public Map<String,Object> getAllWareSpec(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Warespec> wareSpeclist = warespecService.findAll();
        map.put("wareSpeclist",wareSpeclist);
        map.put("msg",true);
        return map;
    }

    @PostMapping("passCheck")
    public Map<String,Object> passCheck(Integer wareid){
        Map<String,Object> map = new HashMap<>();
        Ware ware = wareService.findOneById(wareid);
        ware.setIsaudit(1);
        wareService.changeCheck(ware);
        map.put("msg",true);
        return map;
    }

    @PostMapping("refuseCheck")
    public Map<String,Object> refuseCheck(Integer wareid){
        Map<String,Object> map = new HashMap<>();
        Ware ware = wareService.findOneById(wareid);
        ware.setIsaudit(2);
        wareService.changeCheck(ware);
        map.put("msg",true);
        return map;
    }

    @GetMapping("getCheckWare")
    public Map<String,Object> getCheckWare(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Ware> checkWarelist = wareService.getCheckWare();
        map.put("checkWarelist",checkWarelist);
        map.put("msg",true);
        return map;
    }

    @PostMapping("commitAdminUpdateWare")
    public Map<String,Object> commitAdminUpdateWare(Ware ware){
        Map<String,Object> map = new HashMap<>();
        ware.setLasteditdt(new Date(new Date().getTime()));
        wareService.aUpdateWare(ware);
        map.put("msg",true);
        return map;
    }

    @PostMapping("deleteWare")
    public  Map<String,Object> deleteWare(Integer wareid){
        Map<String,Object> map = new HashMap<>();
        Ware ware = wareService.findOneById(wareid);
        ware.setIsdelete(1);
        wareService.aUpdateWare(ware);
        map.put("msg",true);
        return map;
    }

    @Autowired
    WareService wareService;
    @Resource
    private Redisson redisson;
    @Resource
    private RedisTemplate<Integer,Integer> redisTemplate;
    //卖出的数量
    private static AtomicInteger successCount = new AtomicInteger(0);
    @Resource
    private IWareService wareServiceImpl;
    @Resource
    private IMercharorderService mercharorderServiceImpl;
    @Resource
    private IwareInventoryService iwareInventoryServiceImpl;
    @GetMapping("/findAll")
    public Map findAll(PageInfo<Ware> page,String queryName){
        /*开启分页插件拦截器*/
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Ware> wareList = wareServiceImpl.findAll(queryName);
        //用 PageInfo 对查询结果进行包装
        PageInfo<Ware> pageInfo = new PageInfo(wareList);
        for (Ware ware : wareList) {
            //设置库存（redis与数据库数据保持一致）
            redisTemplate.opsForValue().set(ware.getWareinventory().getWareid(), ware.getWareinventory().getWareinventory());
        }
        successCount = new AtomicInteger(0);
        Map map = new HashMap<>();
        map.put("wareList",wareList);
        map.put("pageInfo",pageInfo);
        return map;
    }
    //处理秒杀
    @PostMapping("/buyWare")
    public String buyWare(Merchartorder merchartorder, HttpServletRequest request, Double saleprice){
        ServletContext servletContext = request.getServletContext();
        Userinfo u = (Userinfo) servletContext.getAttribute("userinfo");
        //查看每个商品的库存，若不够，给出提示信息
        //若够，减少库存数量，增加卖出数量
        RLock lock = redisson.getLock("stockCount");
        try{
            //整体加锁
            lock.lock();
            Integer stockCount = redisTemplate.opsForValue().get(merchartorder.getWareid());
            stockCount -= merchartorder.getWaretotalnumber();
            if (stockCount < 0) {
                return "已售完";
            }
            //修改库存数量
            redisTemplate.opsForValue().set(merchartorder.getWareid(),stockCount);
            for (int i = 0; i < merchartorder.getWaretotalnumber(); i++) {
                successCount.incrementAndGet();
            }
            //库存持久化到数据库
            Wareinventory wareinventory = new Wareinventory();
            wareinventory.setWareid(merchartorder.getWareid());
            wareinventory.setWareoutputtime(new Date());
            wareinventory.setWareoutputnumber(successCount.get());
            wareinventory.setWareinventory(redisTemplate.opsForValue().get(merchartorder.getWareid()));
            iwareInventoryServiceImpl.update(wareinventory);

            //获取当前系统时间的毫秒数
            long t1=System.currentTimeMillis();
            merchartorder.setMerchartorderid(String.valueOf(t1));
            if (u != null){
                merchartorder.setMerchartid(u.getUserid());
            }
            merchartorder.setOrderpaytime(new Date());
            merchartorder.setOrderstate("已支付");
            //实际买的数量
            merchartorder.setWaretotalnumber(successCount.get());
            BigDecimal bigDecimal = new BigDecimal(saleprice * successCount.get());
            merchartorder.setOrdertotalmoney(bigDecimal);

            Integer stockCount1 = redisTemplate.opsForValue().get(merchartorder.getWareid());
            //System.out.println(stockCount1);
            mercharorderServiceImpl.save(merchartorder);
            return "成功卖出"+successCount+"件";
        }finally {
            //解锁
            lock.unlock();
        }
    }
    @PostMapping("/save")
    public void save(Ware ware,int wareinventorynumber){
        ware.setAdddt(new Date());
        ware.setIsdelete(1);
        ware.setIsaudit(0);
        wareServiceImpl.save(ware,wareinventorynumber);
    }
    @PostMapping("/update")
    public void update(Ware ware){
        wareServiceImpl.update(ware);
    }
    @GetMapping("/delete")
    public void delete(int wareid){
        wareServiceImpl.delete(wareid);
    }
    @GetMapping("/findById")
    public Ware findById(int wareid){
        Ware ware = wareServiceImpl.findById(wareid);
        return ware;
    }
    @GetMapping("/queryInventory")
    public Map queryInventory(Wareinventory wareinventory){
        //System.out.println("wareinventory = " + wareinventory.getWareinventory());
        Map map = new HashMap();
        //查找库存数量
        Integer count = redisTemplate.opsForValue().get(wareinventory.getWareid());
        if (count < wareinventory.getWareinventory()){
            map.put("message",true);
        }else{
            map.put("message",false);
        }
        return map;
    }
    //展示商品
    @ResponseBody
    @RequestMapping("wareList")
    public PageInfo wareList(int pageNum){
        PageHelper.startPage(pageNum,3);
        List<Ware> wares=wareService.getAllWares();
        PageInfo<Ware> pageInfo = new PageInfo<Ware>(wares);
        return pageInfo;
    }


}
