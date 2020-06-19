package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.mapper.WareclassificationtypeMapper;
import com.woniu.gdj.service.WareclassificationtypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WareclassificationtypeServiceImpl implements WareclassificationtypeService {
    @Resource
    WareclassificationtypeMapper wareclassificationtypeMapper;

    @Override
    public List<Wareclassificationtype> findAll() {
        return wareclassificationtypeMapper.selectByExample(null);
    }
}
