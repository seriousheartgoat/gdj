package com.woniu.gdj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Merchartorder;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.Wareinventory;
import com.woniu.gdj.service.IMercharorderService;
import com.woniu.gdj.service.IWareService;
import com.woniu.gdj.service.IwareInventoryService;
import org.apache.shiro.web.session.HttpServletSession;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.JarOutputStream;

/**
 * @author cjw
 * @create 2020/06/08 17:38:05
 */
@RestController
@RequestMapping("/Ware")
public class WareController {
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
    public Map findAll(PageInfo<Ware> page){
        /*开启分页插件拦截器*/
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Ware> wareList = wareServiceImpl.findAll();
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
    public void save(Ware ware){
        wareServiceImpl.save(ware);
    }
    @PostMapping("/update")
    public void update(Ware ware){
        wareServiceImpl.update(ware);
    }
    @GetMapping("/delete")
    public void delete(int wareId){
        wareServiceImpl.delete(wareId);
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
}
