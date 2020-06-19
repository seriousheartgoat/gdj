package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Loginlog;
import com.woniu.gdj.entity.Mycollection;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.entity.UserinfoExample;
import com.woniu.gdj.mapper.UserinfoMapper;
import com.woniu.gdj.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Resource
    UserinfoMapper userinfoMapper;

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

    @Override
    public Userinfo login(Userinfo userinfo) {
        return null;
    }

    @Override
    public int register(Userinfo userinfo) {
        return 0;
    }

    @Override
    public Userinfo getUserinfo(int userid) {
        return null;
    }

    @Override
    public int userinfoUpdate(Userinfo userinfo) {
        return 0;
    }

    @Override
    public List<Mycollection> getCollections(int userid) {
        return null;
    }
}
