package com.woniu.gdj.service;

import com.woniu.gdj.entity.Userforder;

import java.util.List;

public interface UserforderService {

    //加入订单表
    int addForder(Userforder userforder);

    //获取我的所有订单
    List<Userforder> getMyForeders(int userid);
}
