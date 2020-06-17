package com.woniu.gdj.controller;


import com.woniu.gdj.entity.Message;
import com.woniu.gdj.tools.NumberCreate;
import com.woniu.gdj.tools.SmS;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
public class SendSms {
//    @Resource
//    private RedisTemplate<String,String> redisTemplate;
//
//    @GetMapping("/send")
//    public Message send(String telno){
//        String number = NumberCreate.getNumber();
//        System.out.println(telno+"----------"+number);
//        SmS.send(telno, number);
//        redisTemplate.opsForValue().set(telno, number);
//        //60秒过期
//        redisTemplate.expire(telno, 60, TimeUnit.SECONDS);
//        Message msg = new Message(true, "发送验证码成功!");
//        return msg;
//    }
//
//    @GetMapping("/validatenum")
//    public Message validatenum(String telno,String number){
//        boolean success = false;
//        if(telno!=null&&number!=null){
//            String redisnumber = redisTemplate.opsForValue().get(telno);
//            if(number.equals(redisnumber)){
//                System.out.println("验证这个手机就是你的，你可以做该做的事情了");
//                //注册  密码找回(进入修改密码的页面)
//                success = true;
//            }
//        }
//        Message msg = new Message(success, "校验完毕!");
//        return msg;
//    }
}