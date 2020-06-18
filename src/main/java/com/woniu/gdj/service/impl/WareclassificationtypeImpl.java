package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.entity.WareclassificationtypeExample;
import com.woniu.gdj.mapper.WareclassificationtypeMapper;
import com.woniu.gdj.service.IWareclassificationtypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cjw
 * @create 2020/06/08 16:26:04
 */
@Service
public class WareclassificationtypeImpl implements IWareclassificationtypeService {
    @Resource
    private WareclassificationtypeMapper wtMapper;

    @Override
    public List<Wareclassificationtype> findAll(String queryName) {
        WareclassificationtypeExample example = new WareclassificationtypeExample();
        WareclassificationtypeExample.Criteria criteria = example.createCriteria();
        if (queryName !=null){
            criteria.andWareclassificationtypenameLike(queryName);
        }
        return wtMapper.selectByExample(example);
    }

    @Override
    public void save(Wareclassificationtype wt) {
        wt.setIsdelete(1);
        wtMapper.insertSelective(wt);
    }

    @Override
    public void update(Wareclassificationtype wt) {
        wtMapper.updateByPrimaryKeySelective(wt);
    }

    @Override
    public void delete(int wareClassificationTypeID) {
        wtMapper.deleteByPrimaryKey(wareClassificationTypeID);
    }

    @Override
    public Wareclassificationtype findById(int wareClassificationTypeID) {
        return wtMapper.selectByPrimaryKey(wareClassificationTypeID);
    }
}
