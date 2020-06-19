package com.woniu.gdj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Merchart;
import com.woniu.gdj.entity.Wareimage;
import com.woniu.gdj.service.IMerchartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cjw
 * @create 2020/06/12 14:05:21
 */
@RestController
@RequestMapping("/merchart")
public class MerchartController {
    @Resource
    private IMerchartService merchartServiceImpl;
    @GetMapping("/findAll")
    public Map findAll(PageInfo<Merchart> page,String queryName){
        /*开启分页插件拦截器*/
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Merchart> merchartList = merchartServiceImpl.findAll(queryName);
        //用 PageInfo 对查询结果进行包装
        PageInfo<Merchart> pageInfo = new PageInfo(merchartList);
        Map map = new HashMap<>();
        map.put("merchartList",merchartList);
        map.put("pageInfo",pageInfo);
        return map;
    }
}
