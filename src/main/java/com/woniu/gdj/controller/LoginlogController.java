package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Loginlog;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.service.LoginlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/loginlog")
public class LoginlogController {
    @Resource
    LoginlogService loginlogService;

    @GetMapping("getAllLoginLog")
    public Map<String,Object> getAllLoginLog(){
        Map<String,Object> map = new HashMap<>();
        List<Loginlog> loginlogList = loginlogService.findAll();

        map.put("loginloglist",loginlogList);
        return map;
    }
}
