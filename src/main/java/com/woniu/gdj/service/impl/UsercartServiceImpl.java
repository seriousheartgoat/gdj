package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Usercart;
import com.woniu.gdj.entity.UsercartExample;
import com.woniu.gdj.mapper.UsercartMapper;
import com.woniu.gdj.service.UsercartService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UsercartServiceImpl implements UsercartService {

    @Resource
    UsercartMapper usercartMapper;

    //检查购物车是否已有该商品
    @Override
    public Usercart checkCount(int userid, String warecode) {
        UsercartExample example = new UsercartExample();
        UsercartExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andWarecodeEqualTo(warecode);
        List<Usercart> list = usercartMapper.selectByExample(example);
        return list.size()==0?null:list.get(0);
    }

    //更改购物车商品数量
    @Override
    public int updateCount(Usercart usercart1) {
        int a = usercartMapper.updateByPrimaryKeySelective(usercart1);
        return a;
    }

    //添加购物车数据
    @Override
    public int addCart(Usercart usercart) {
        int a = usercartMapper.insertSelective(usercart);
        return a;
    }

    //获取所有购物车的信息
    @Override
    public List<Usercart> selectUsercartByUserid(int userid) {
        UsercartExample example= new UsercartExample();
        UsercartExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<Usercart> list = usercartMapper.selectByExample(example);
        return list;
    }

    //删除选中的购物车信息
    @Override
    public int deleteCart(int usercartid) {
        return usercartMapper.deleteByPrimaryKey(usercartid);
    }

    //删除用户所有的购物车记录
    @Override
    public void deleteCartByUserid(int userid) {
        UsercartExample example = new UsercartExample();
        UsercartExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        usercartMapper.deleteByExample(example);
    }
}
