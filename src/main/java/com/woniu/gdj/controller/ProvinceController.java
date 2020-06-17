package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Province;
import com.woniu.gdj.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @ResponseBody
    @RequestMapping("provinces")
    public List<Province> getProvinces(){
        List<Province> list = provinceService.getProvinces();
        return list;
    }


}
