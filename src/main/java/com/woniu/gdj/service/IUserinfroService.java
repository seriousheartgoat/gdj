package com.woniu.gdj.service;

import com.woniu.gdj.entity.Userinfo;

/**
 * @author cjw
 * @create 2020/06/09 16:08:47
 */
public interface IUserinfroService {
    Userinfo supperlierByUserName(String userName);

    void register(Userinfo userinfo);
}
