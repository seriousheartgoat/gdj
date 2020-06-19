package com.woniu.gdj.service;

import com.woniu.gdj.entity.Usercart;

import java.math.BigDecimal;
import java.util.List;

public interface UsercartService {

    //检查购物车是否已有该商品
    Usercart checkCount(int userid, String warecode);

    //更改购物车商品数量
    int updateCount(Usercart usercart1);

    //添加购物车数据
    int addCart(Usercart usercart);

    //获取所有购物车的信息
    List<Usercart> selectUsercartByUserid(int userid);

    //删除选中的购物车信息
    int deleteCart(int usercartid);

    //删除用户所有的购物车记录
    void deleteCartByUserid(int userid);
}
