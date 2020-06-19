package com.woniu.gdj.service;

import com.woniu.gdj.entity.Userinfo;

import java.util.List;

public interface UserinfoService {
    Userinfo adminLogin(Userinfo userinfo);

    List<Userinfo> findAll();

    void aUpdateUser(Userinfo userinfo);

    Userinfo findOneByID(Integer userid);

    void adminAddUser(Userinfo userinfo);
}
