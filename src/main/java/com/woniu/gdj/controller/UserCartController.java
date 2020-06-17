package com.woniu.gdj.controller;

import com.woniu.gdj.entity.*;

import com.woniu.gdj.service.UsercartService;
import com.woniu.gdj.service.UserinfoService;
import com.woniu.gdj.service.WareService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("cart")
public class UserCartController {
    @Autowired
    UsercartService usercartService;
    @Autowired
    WareService wareService;
    @Autowired
    UserinfoService userinfoService;


    @ResponseBody
    @RequestMapping("addCart")
    //加入购物车
    public Map<String,Object> register(int userid,int wareid) {
        Map<String,Object> map = new HashMap<String,Object>();
        Usercart usercart = new Usercart();
        //查询wareid对应的商品信息
        Ware ware = wareService.selectByWareid(wareid);

        //购物车是否有重复的商品
        Usercart usercart1 = usercartService.checkCount(userid,ware.getWarecode());
        if(usercart1!=null){
            //更改购物车中warecount数量
            BigDecimal add= new BigDecimal("1");
            BigDecimal checkCount= usercart1.getWarecount().add(add);
            usercart1.setWarecount(checkCount);
            int a = usercartService.updateCount(usercart1);
            if(a!=0) {
                map.put("result", true);
            }else{
                map.put("result",false);
            }
            return map;
        }else {
            //添加购物车记录
            usercart.setUserid(userid);
            usercart.setWarecode(ware.getWarecode());
            usercart.setWarreno(ware.getWareno());
            usercart.setWarename(ware.getWarename());
            usercart.setWareprice(ware.getSaleprice());
            usercart.setStoreid(ware.getStore().getStoreid());
            usercart.setStorename(ware.getStore().getStorename());
            usercart.setWareimgid(ware.getWareimage().getWareimgid());
            usercart.setWarecount(new BigDecimal("1"));
            int a = usercartService.addCart(usercart);
            if(a!=0) {
                map.put("result", true);
            }else{
                map.put("result",false);
            }
            return map;
        }

    }


    //获取所有购物车信息
    @ResponseBody
    @RequestMapping("getUserCart")
    public List<Usercart> getUserCart(int userid){
        List<Usercart> list = usercartService.selectUsercartByUserid(userid);
        return list;
    }

    //删除购物车信息
    @ResponseBody
    @RequestMapping("deleteCart")
    public Map<String,Object> register(int usercartid) {
        Map<String, Object> map = new HashMap<String, Object>();
        int a = usercartService.deleteCart(usercartid);
        if(a!=0) {
            map.put("result", true);
        }else{
            map.put("result",false);
        }
        return map;
    }

    //检查余额是否足够
    @ResponseBody
    @RequestMapping("checkBalance")
    public Map<String,Object> checkBalance(int userid,HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        //获取总价
        List<Usercart> list = usercartService.selectUsercartByUserid(userid);
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < list.size(); i++) {
            sum=sum.add(list.get(i).getWarecount().multiply(list.get(i).getWareprice()));
        }
        //将总价放入全局变量servletContext
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("forderPrice",sum);

        //获取余额
        Userinfo userinfo = userinfoService.getUserinfo(userid);
        BigDecimal balance = userinfo.getBalance();

        //总价大于余额
        int i =sum.compareTo(balance);
        if(i == 1){
            map.put("result",false);
        }else{
            //余额减去总价
            balance = balance.subtract(sum);
            userinfo.setBalance(balance);
            System.out.println(userinfo);
            userinfoService.userinfoUpdate(userinfo);
            //删除购物车记录
            usercartService.deleteCartByUserid(userid);
            map.put("result",true);
        }
        return map;
    }
}
