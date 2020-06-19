package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.WareExample;
import com.woniu.gdj.mapper.WareMapper;
import com.woniu.gdj.service.WareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class WareServiceImpl implements WareService {
    @Resource
    WareMapper wareMapper;

    @Override
    public List<Ware> getAllWares() {
        return null;
    }

    @Override
    public Ware selectByWareid(int wareid) {
        return null;
    }

    @Override
    public List<Ware> findAll() {
        List<Ware> tmp = wareMapper.selectByExample(null);
        List<Ware> list = new ArrayList<>();
        for (Ware ware:tmp) {
            if(ware.getIsaudit().equals(1)&&ware.getIsdelete().equals(0)){
               list.add(ware);
            }
        }
        return list;
    }

    @Override
    public Ware findOneById(Integer wareid) {
        return wareMapper.selectByPrimaryKey(wareid);
    }

    @Override
    public void changeCheck(Ware ware) {
        wareMapper.updateByPrimaryKeySelective(ware);
    }

    @Override
    public List<Ware> getCheckWare() {
        WareExample example = new WareExample();
        WareExample.Criteria criteria = example.createCriteria();
        criteria.andIsauditEqualTo(0);

        List<Ware> list = wareMapper.selectByExample(example);
        return list;
    }

    @Override
    public void aUpdateWare(Ware ware) {
        wareMapper.updateByPrimaryKeySelective(ware);
    }
}
