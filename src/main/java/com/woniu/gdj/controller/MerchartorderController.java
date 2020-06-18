package com.woniu.gdj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Merchart;
import com.woniu.gdj.entity.Merchartorder;
import com.woniu.gdj.service.IMercharorderService;
import com.woniu.gdj.service.IMerchartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cjw
 * @create 2020/06/17 00:59:25
 */
@RestController
@RequestMapping("/merchartorder")
public class MerchartorderController {
    @Resource
    private IMercharorderService mercharorderServiceImpl;
    @Resource
    private IMerchartService merchartServiceImpl;
    @GetMapping("/findAll")
    public Map findAll(PageInfo<Merchartorder> page,Merchartorder merchartorder,int orderstateid){
        /*开启分页插件拦截器*/
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Merchartorder> merchartorderList = mercharorderServiceImpl.findAll(merchartorder,orderstateid);
        //用 PageInfo 对查询结果进行包装
        PageInfo<Merchartorder> pageInfo = new PageInfo(merchartorderList);
        List<Merchart> merchartList = merchartServiceImpl.list();
        Map map = new HashMap<>();
        map.put("merchartorderList",merchartorderList);
        map.put("merchartList",merchartList);
        map.put("pageInfo",pageInfo);
        return map;
    }
    @PostMapping("/send")
    public void send(Merchartorder merchartorder){
        mercharorderServiceImpl.send(merchartorder);
    }
}
