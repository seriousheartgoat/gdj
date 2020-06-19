package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Province;
import com.woniu.gdj.mapper.ProvinceMapper;
import com.woniu.gdj.service.ProvinceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    ProvinceMapper provinceMapper;

    @Override
    public List<Province> getProvinces() {
        return provinceMapper.selectByExample(null);
    }
}
