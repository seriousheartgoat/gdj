package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Merchart;
import com.woniu.gdj.mapper.MerchartMapper;
import com.woniu.gdj.service.IMerchartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cjw
 * @create 2020/06/12 14:07:48
 */
@Service
public class MerchartServiceImpl implements IMerchartService {
    @Resource
    private MerchartMapper merchartMapper;

    @Override
    public List<Merchart> findAll(String queryName)
    {
        return merchartMapper.selectByWare(queryName);
    }

    @Override
    public List<Merchart> list() {
        return merchartMapper.selectByExample(null);
    }
}
