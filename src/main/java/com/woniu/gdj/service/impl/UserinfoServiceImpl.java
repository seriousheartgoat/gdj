package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Mycollection;
import com.woniu.gdj.entity.MycollectionExample;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.entity.UserinfoExample;
import com.woniu.gdj.mapper.MycollectionMapper;
import com.woniu.gdj.mapper.UserinfoMapper;
import com.woniu.gdj.service.UserinfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import com.woniu.gdj.entity.Loginlog;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.entity.UserinfoExample;
import com.woniu.gdj.mapper.UserinfoMapper;
import com.woniu.gdj.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import com.woniu.gdj.entity.Loginlog;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.entity.UserinfoExample;
import com.woniu.gdj.mapper.UserinfoMapper;
import com.woniu.gdj.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class UserinfoServiceImpl implements UserinfoService, IUserinfroService {

    @Resource
    UserinfoMapper userinfoMapper;

    @Resource
    MycollectionMapper mycollectionMapper;


    @Override
    //用户的登录
    public Userinfo login(Userinfo userinfo) {
    @Override
    public Userinfo adminLogin(Userinfo userinfo) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(userinfo.getUsername());
        criteria.andUserpwdEqualTo(userinfo.getUserpwd());
        List<Userinfo> list = userinfoMapper.selectByExample(example);
        return list.size()==0?null:list.get(0);
    }


    @Override
    public Userinfo supperlierByUserName(String userName) {
        return userinfoMapper.supperlierByUserName(userName);
    }

    @Override
    public void Myregister(Userinfo userinfo) {
        userinfoMapper.insertSelective(userinfo);
    }

    //用户的注册
    @Override
    public int register(Userinfo userinfo) {
        int a = userinfoMapper.insertSelective(userinfo);
        return a;
    }

    //个人信息的获取
    @Override
    public Userinfo getUserinfo(int userid) {
        Userinfo userinfo = userinfoMapper.selectUserinfoByUserid(userid);
        return userinfo;
    }

    //个人信息的修改
    @Override
    public int userinfoUpdate(Userinfo userinfo) {
        int a = userinfoMapper.updateByPrimaryKeySelective(userinfo);
        return a;
    }

    //获取我的收藏
    @Override
    public List<Mycollection> getCollections(int userid) {
        MycollectionExample example = new MycollectionExample();
        MycollectionExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<Mycollection> list = mycollectionMapper.selectByExample(example);
        return list;

        return list.size()==0?null:list.get(0);
    }

    @Override
    public List<Userinfo> findAll() {
        List<Userinfo> list = userinfoMapper.selectByExample(null);
        return list;
    }

    @Override
    public void aUpdateUser(Userinfo userinfo) {
        userinfoMapper.updateByPrimaryKeySelective(userinfo);
    }

    @Override
    public Userinfo findOneByID(Integer userid) {

        return userinfoMapper.selectByPrimaryKey(userid);
    }

    @Override
    public void adminAddUser(Userinfo userinfo) {
        userinfoMapper.insert(userinfo);
    }
}
