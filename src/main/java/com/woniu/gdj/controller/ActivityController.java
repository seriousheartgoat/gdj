package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Wareactivity;
import com.woniu.gdj.service.WareactivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Resource
    WareactivityService wareactivityService;

    @GetMapping("showActivity")
    public Map<String,Object> showActivity(){
        Map<String,Object> map = new HashMap<>();
        List<Wareactivity> activitylist = wareactivityService.findAll();
        map.put("msg",true);
        map.put("activitylist",activitylist);
        return map;
    }
}
