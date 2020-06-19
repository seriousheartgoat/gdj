package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Custommessage;
import com.woniu.gdj.mapper.CustommessageMapper;
import com.woniu.gdj.service.CustommessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustommessageServiceImpl implements CustommessageService {
    @Resource
    CustommessageMapper custommessageMapper;

    @Override
    public List<Custommessage> findAll() {
        return custommessageMapper.selectByExample(null);
    }
}
