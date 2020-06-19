package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.Warespec;
import com.woniu.gdj.mapper.WarespecMapper;
import com.woniu.gdj.service.WareService;
import com.woniu.gdj.service.WarespecService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarespecServiceImpl implements WarespecService {

    @Resource
    WarespecMapper warespecMapper;


    @Override
    public List<Warespec> findAll() {
        return warespecMapper.selectByExample(null);
    }
}
