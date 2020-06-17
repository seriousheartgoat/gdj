package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Merchartorder;
import com.woniu.gdj.mapper.MerchartorderMapper;
import com.woniu.gdj.service.IMercharorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cjw
 * @create 2020/06/17 00:55:43
 */
@Service
public class MercharorderImpl implements IMercharorderService {
    @Resource
    private MerchartorderMapper merchartorderMapper;

    @Override
    public void save(Merchartorder merchartorder) {
        merchartorderMapper.insertSelective(merchartorder);
    }
}
