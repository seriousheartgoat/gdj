package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Userforder;
import com.woniu.gdj.service.UserforderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("userforder")
public class UserforderController {

    @Autowired
    UserforderService userforderService;

    //加入订单表
    @ResponseBody
    @RequestMapping("addForder")
    public Map<String,Object> addForder(Userforder userforder,HttpServletRequest request) {
        //从全局变量servletContext中获取放入的总价
        ServletContext servletContext = request.getServletContext();
        BigDecimal sum = (BigDecimal) servletContext.getAttribute("forderPrice");
        Map<String, Object> map = new HashMap<String, Object>();
        userforder.setPaydt(new Date());
        userforder.setForderprice(sum);
        int a = userforderService.addForder(userforder);
        if(a!=0) {
            map.put("result", true);
        }else{
            map.put("result",false);
        }
        return map;
    }

    //查看我的所有订单
    @ResponseBody
    @RequestMapping("getMyForders")
    public List<Userforder> getMyForders(int userid){
        List<Userforder> list = userforderService.getMyForeders(userid);
        return list;
    }

}

