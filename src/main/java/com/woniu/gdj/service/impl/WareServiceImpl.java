package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.mapper.WareMapper;
import com.woniu.gdj.service.IWareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cjw
 * @create 2020/06/08 17:39:11
 */
@Service
public class WareServiceImpl implements IWareService {
    @Resource
    private WareMapper wareMapper;

    @Override
    public List<Ware> findAll() {
        return wareMapper.findAll();
    }

    @Override
    public void save(Ware ware) {
        wareMapper.insertSelective(ware);
    }

    @Override
    public void update(Ware ware) {
        wareMapper.updateByPrimaryKeySelective(ware);
    }

    @Override
    public void delete(int wareId) {
        wareMapper.deleteByPrimaryKey(wareId);
    }

    @Override
    public Ware findById(int wareId) {

        return wareMapper.findById(wareId);
    }

    @Override
    public List<Ware> list() {
        return wareMapper.findAll();
    }
}
