package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Checkentry;
import com.woniu.gdj.mapper.CheckentryMapper;
import com.woniu.gdj.service.CheckentryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CheckentryServiceImpl implements CheckentryService {

    @Resource
    CheckentryMapper checkentryMapper;

    @Override
    public List<Checkentry> getAllCheck() {
        return checkentryMapper.selectByExample(null);
    }

    @Override
    public Checkentry findOneById(Integer checkentryid) {
        return checkentryMapper.selectByPrimaryKey(checkentryid);
    }

    @Override
    public void changeCheck(Checkentry checkentry) {
        checkentryMapper.updateByPrimaryKeySelective(checkentry);
    }
}
