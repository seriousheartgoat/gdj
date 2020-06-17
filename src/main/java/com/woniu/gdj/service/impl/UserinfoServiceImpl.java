package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.mapper.UserinfoMapper;
import com.woniu.gdj.service.IUserinfroService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cjw
 * @create 2020/06/09 16:09:03
 */
@Service
public class UserinfoServiceImpl implements IUserinfroService {
    @Resource
    private UserinfoMapper userinfoMapper;

    @Override
    public Userinfo supperlierByUserName(String userName) {
        return userinfoMapper.supperlierByUserName(userName);
    }

    @Override
    public void register(Userinfo userinfo) {
        userinfoMapper.insertSelective(userinfo);
    }
}
