package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Marketsorder;
import com.woniu.gdj.mapper.MarketsorderMapper;
import com.woniu.gdj.service.MarketOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MarketOrderServiceImpl implements MarketOrderService {

    @Resource
    MarketsorderMapper marketsorderMapper;

    @Override
    public List<Marketsorder> findAll() {
        return marketsorderMapper.selectByExample(null);
    }
}
