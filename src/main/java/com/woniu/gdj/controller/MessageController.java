package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Custommessage;
import com.woniu.gdj.entity.Store;
import com.woniu.gdj.service.CustommessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Resource
    CustommessageService custommessageService;

    @GetMapping("showCustomerMsg")
    public Map<String,Object> showCustomerMsg(){
        Map<String,Object> map = new HashMap<>();
        List<Custommessage> msglist = custommessageService.findAll();
        map.put("msglist",msglist);
        return map;
    }
}
