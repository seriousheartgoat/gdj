package com.woniu.gdj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Merchart;
import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.Wareinventory;
import com.woniu.gdj.service.IWareService;
import com.woniu.gdj.service.IwareInventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cjw
 * @create 2020/06/12 15:55:39
 */
@RequestMapping("/wareInventory")
@RestController
public class wareInventoryController {
    @Resource
    private IwareInventoryService wareInventoryServiceImpl;
    @Resource
    private IWareService wareServiceImpl;
    @GetMapping("/findAll")
    public Map findAll(PageInfo<Merchart> page,Wareinventory wareinventory){
        //System.out.println(wareinventory.getWareinputtime());
        /*开启分页插件拦截器*/
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Wareinventory> wareinventoryList = wareInventoryServiceImpl.findAll(wareinventory);
        List<Ware> wareList = wareServiceImpl.list();
        //用 PageInfo 对查询结果进行包装
        PageInfo<Wareinventory> pageInfo = new PageInfo(wareinventoryList);
        Map map = new HashMap<>();
        map.put("wareinventoryList",wareinventoryList);
        map.put("pageInfo",pageInfo);
        map.put("wareList",wareList);
        return map;
    }
}
