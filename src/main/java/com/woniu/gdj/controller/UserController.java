package com.woniu.gdj.controller;
import com.woniu.gdj.entity.Mycollection;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserinfoService userinfoService;

    //处理用户商城页面的登录
    @ResponseBody
    @RequestMapping("login")
    public Userinfo doLogin(Userinfo userinfo, HttpSession session) {
        Userinfo loginUser = userinfoService.login(userinfo);
        if(loginUser!=null) {
            session.setAttribute("loginUser", loginUser);
            return loginUser;
        }else{
            return null;
        }

    }


    //注册
    @ResponseBody
    @RequestMapping("register")
    public Map<String,Object> register(Userinfo userinfo) {
        Map<String,Object> map = new HashMap<String,Object>();
        int a = userinfoService.register(userinfo);
        if(a!=0) {
            map.put("result", true);
        }else{
            map.put("result",false);
        }
        return map;
    }
    //个人信息修改
    @ResponseBody
    @PostMapping("userinfoUpdate")
    public Map<String,Object> userinfoUpdate(Userinfo userinfo){
        Map<String,Object> map = new HashMap<String,Object>();
        int a = userinfoService.userinfoUpdate(userinfo);

        if(a!=0) {
            map.put("result", true);
        }else{
            map.put("result",false);
        }
        return map;
    }

    //我的收藏
    @ResponseBody
    @RequestMapping("getCollections")
    public List<Mycollection> getCollections(int userid){
        List<Mycollection> list = userinfoService.getCollections(userid);
        return list;
    }

    //密码修改
    @ResponseBody
    @RequestMapping("userpwdUpdate")
    public Map<String,Object> userpwdUpdate(int userid,String newpwd1){
        Map<String,Object> map = new HashMap<String,Object>();
        Userinfo userinfo = new Userinfo();
        userinfo.setUserid(userid);
        userinfo.setUserpwd(newpwd1);
        int a = userinfoService.userinfoUpdate(userinfo);
        if(a!=0) {
            map.put("result", true);
        }else{
            map.put("result",false);
        }
        return map;
    }

    //充值
    @ResponseBody
    @RequestMapping("doRecharge")
    public Map<String,Object> doRecharge(BigDecimal money, BigDecimal balance,int userid){
        Map<String,Object> map = new HashMap<String,Object>();
        Userinfo userinfo = new Userinfo();
        userinfo.setUserid(userid);
        BigDecimal finalBalance =  balance.add(money);
        userinfo.setBalance(finalBalance);
        int a = userinfoService.userinfoUpdate(userinfo);
        if(a!=0) {
            map.put("result", true);
        }else{
            map.put("result",false);
        }
        return map;
    }

}
