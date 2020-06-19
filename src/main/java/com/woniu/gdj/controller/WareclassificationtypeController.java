package com.woniu.gdj.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.service.IWareclassificationtypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cjw
 * @create 2020/06/08 16:25:12
 */
@RestController
@RequestMapping("/Wareclassificationtype")
public class WareclassificationtypeController {
    @Resource
    private IWareclassificationtypeService wtServiceImpl;
    @GetMapping("/findAll")
    public Map findAll(PageInfo<Wareclassificationtype> page,String queryName){
        //System.out.println(page.getPageNum()+"===="+page.getPageSize());
        /*开启分页插件拦截器*/
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Wareclassificationtype> wtList = wtServiceImpl.findAll(queryName);
        //System.out.println(wtList);
        //用 PageInfo 对查询结果进行包装
        PageInfo<Wareclassificationtype> pageInfo = new PageInfo(wtList);
        Map map = new HashMap<>();
        map.put("wtList",wtList);
        map.put("pageInfo",pageInfo);
        return map;
    }
    @PostMapping("/save")
    public void save(Wareclassificationtype wt){
        wtServiceImpl.save(wt);
    }
    @PostMapping("/update")
    public void update(Wareclassificationtype wt){
        //System.out.println(wt.getThenote()+"=="+wt.getWareclassificationtypename()+"==="+wt.getWareclassificationtypeid());
        wtServiceImpl.update(wt);
    }
    @GetMapping("/delete")
    public void delete(int wareclassificationtypeid){
        wtServiceImpl.delete(wareclassificationtypeid);
    }
    @GetMapping("/findById")
    public Wareclassificationtype findById(int wareclassificationtypeid){
        return wtServiceImpl.findById(wareclassificationtypeid);
    }
}
