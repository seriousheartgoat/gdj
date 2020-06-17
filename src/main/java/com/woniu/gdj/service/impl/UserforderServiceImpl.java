package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Userforder;
import com.woniu.gdj.entity.UserforderExample;
import com.woniu.gdj.mapper.UserforderMapper;
import com.woniu.gdj.service.UserforderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserforderServiceImpl implements UserforderService {

    @Resource
    UserforderMapper userforderMapper;

    //加入订单表
    @Override
    public int addForder(Userforder userforder) {
        int a = userforderMapper.insertSelective(userforder);
        return a;
    }

    //获取我的所有订单
    @Override
    public List<Userforder> getMyForeders(int userid) {
        UserforderExample example = new UserforderExample();
        UserforderExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<Userforder> list = userforderMapper.selectByExample(example);
        return list;
    }
}
