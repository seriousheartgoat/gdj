package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.service.UserinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userinfo")
public class UserinfoController {
    @Resource
    UserinfoService userinfoService;

    @GetMapping("getAllUser")
    public Map<String,Object> getAllUser(){
        Map<String,Object> map = new HashMap<>();
        List<Userinfo> userinfolist = userinfoService.findAll();
        map.put("userinfolist",userinfolist);

        return map;
    }

    @PostMapping("commitAdminUpdateUser")
    public Map<String,Object> commitAdminUpdateUser(Userinfo userinfo){
        Map<String,Object> map = new HashMap<>();
        userinfoService.aUpdateUser(userinfo);
        map.put("msg",true);
        return map;
    }

    @PostMapping("commitAdminAddUser")
    public Map<String,Object> commitAdminAddUser(Userinfo userinfo){
        Map<String,Object> map = new HashMap<>();
        userinfo.setUserpwd("123456");
        userinfo.setIsdelete(0);
        userinfo.setUserregdt(new Date(new Date().getTime()));
        userinfoService.adminAddUser(userinfo);
        map.put("msg",true);
        return map;
    }
    @PostMapping("changeStatus")
    public Map<String,Object> changeStatus(Integer userid){
        System.out.println(userid);
        Map<String,Object> map = new HashMap<>();
        Userinfo userinfo = userinfoService.findOneByID(userid);
        if(userinfo.getIsdelete()==0){
            userinfo.setIsdelete(1);
        }else{
            userinfo.setIsdelete(0);
        }
        userinfoService.aUpdateUser(userinfo);

        map.put("msg",true);
        return map;
    }
}
