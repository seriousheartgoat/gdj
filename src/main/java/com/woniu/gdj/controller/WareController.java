package com.woniu.gdj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("ware")
public class WareController {

    @Autowired
    WareService wareService;


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
