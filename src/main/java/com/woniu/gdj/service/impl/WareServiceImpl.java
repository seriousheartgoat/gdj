package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.mapper.WareMapper;
import com.woniu.gdj.service.IWareService;
import com.woniu.gdj.service.WareService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class WareServiceImpl implements WareService, IWareService {

    @Resource
    WareMapper wareMapper;
    //得到所有的商品信息
    @Override
    public List<Ware> getAllWares() {
        return wareMapper.selectByExample(null);
    }

    //得到对应id的商品信息
    @Override
    public Ware selectByWareid(int wareid) {
        return wareMapper.selectByPrimaryKey(wareid);
    }

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
