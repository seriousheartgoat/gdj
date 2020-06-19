package com.woniu.gdj.service;

import com.woniu.gdj.entity.Mycollection;
import com.woniu.gdj.entity.Userinfo;

import java.util.List;

public interface UserinfoService {
    Userinfo adminLogin(Userinfo userinfo);

    List<Userinfo> findAll();

    void aUpdateUser(Userinfo userinfo);

    Userinfo findOneByID(Integer userid);

    void adminAddUser(Userinfo userinfo);

    //登录
    Userinfo login(Userinfo userinfo);

    //注册
    int register(Userinfo userinfo);

    //个人信息的获取
    Userinfo getUserinfo(int userid);

    //个人信息的修改
    int userinfoUpdate(Userinfo userinfo);

    //获取我的收藏
    List<Mycollection> getCollections(int userid);
}
