package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.service.IUserinfroService;
import org.apache.catalina.User;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cjw
 * @create 2020/06/09 16:08:16
 */
@RestController
@RequestMapping("/userinfo")
public class SupplierLoginController {
    @Resource
    private IUserinfroService userinfroServiceImpl;
    @PostMapping("/supplierLogin")
    public Map login(String userName, String userPwd, HttpServletRequest request){
        Map map = new HashMap();
        ServletContext servletContext = request.getServletContext();
        try{
            Userinfo userinfo = userinfroServiceImpl.supperlierByUserName(userName);
            if (userPwd.equals(userinfo.getUserpwd())){
                servletContext.setAttribute("userinfo",userinfo);
                map.put("userinfo",userinfo);
                return map;
            }
        }catch (Exception e){
            map.put("userinfo",null);
            return map;
        }
        return map;
    }
    @PostMapping("/supplierRegisterByName")
    public String registerByName(String userName){
        try{
            Userinfo userinfo = userinfroServiceImpl.supperlierByUserName(userName);
            if (userinfo==null){
                return "1";
            }
        }catch (Exception e){
            return "0";
        }
        return "0";
    }
    @PostMapping("/supplierRegister")
    public String register(String userName,String userPwd){
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername(userName);
        userinfo.setUserpwd(userPwd);
        try{
            userinfroServiceImpl.register(userinfo);
            return "1";
        }catch (Exception e){
            return "0";
        }
    }
    @GetMapping("/supplierLogOut")
    public String register(HttpSession session){
        session.invalidate();
       return "loginOut";
    }
}
