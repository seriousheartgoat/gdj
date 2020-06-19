package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Wareactivity;
import com.woniu.gdj.mapper.WareactivityMapper;
import com.woniu.gdj.service.WareactivityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WareactivityServiceImpl implements WareactivityService {
    @Resource
    WareactivityMapper wareactivityMapper;

    @Override
    public List<Wareactivity> findAll() {
        return wareactivityMapper.selectByExample(null);
    }
}
