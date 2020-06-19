package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Loginlog;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.service.LoginlogService;
import com.woniu.gdj.service.UserinfoService;
import org.apache.catalina.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    UserinfoService userinfoService;
    @Resource
    LoginlogService loginlogService;

    @PostMapping("login")
    public Map<String,Object> login(String username,String userpwd,String ip,String address){

        Userinfo userinfo = new Userinfo();
        userinfo.setUsername(username);
        userinfo.setUserpwd(userpwd);
        Userinfo loginUser = userinfoService.adminLogin(userinfo);

        Loginlog loginlog = new Loginlog();
        loginlog.setIp(ip);

        Date date = new Date(new Date().getTime());
        loginlog.setLogindt(date);
        loginlogService.add(loginlog);

        Map<String,Object> map = new HashMap<>();
        if(loginUser!=null){
            loginlog.setUserid(loginUser.getUserid());
            map.put("msg",true);
            map.put("loginUser",loginUser);
            map.put("loginLogID",loginlog.getLoginid());
        }else {
            map.put("msg",false);
        }
        return map;
    }

    @PostMapping("logout")
    public Map<String,Object> logout(Integer loginLogID){
        Loginlog loginlog = loginlogService.findOneByID(loginLogID);
        Date date = new Date(new Date().getTime());
        loginlog.setLogoutdt(date);
        loginlogService.update(loginlog);

        Map<String,Object> map = new HashMap<>();
        map.put("msg",true);
        return map;
    }

}
