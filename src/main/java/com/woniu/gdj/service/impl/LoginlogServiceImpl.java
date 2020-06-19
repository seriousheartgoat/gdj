package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Loginlog;
import com.woniu.gdj.entity.LoginlogExample;
import com.woniu.gdj.mapper.LoginlogMapper;
import com.woniu.gdj.service.LoginlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginlogServiceImpl implements LoginlogService {

    @Resource
    LoginlogMapper loginlogMapper;

    @Override
    public List<Loginlog> findAll() {
        List<Loginlog> list = loginlogMapper.selectByExample(null);
        return list;
    }

    @Override
    public void add(Loginlog loginlog) {
       loginlogMapper.addLoginlog(loginlog);

    }

    @Override
    public Loginlog findOneByID(Integer loginLogID) {
        Loginlog loginlog = loginlogMapper.selectByPrimaryKey(loginLogID);
        return loginlog;
    }

    @Override
    public void update(Loginlog loginlog) {
        loginlogMapper.updateByPrimaryKey(loginlog);
    }
}
