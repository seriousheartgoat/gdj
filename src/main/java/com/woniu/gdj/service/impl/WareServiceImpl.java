package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.WareExample;
import com.woniu.gdj.mapper.WareMapper;
import com.woniu.gdj.service.WareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class WareServiceImpl implements WareService {
    @Resource
    WareMapper wareMapper;

    @Override
    public List<Ware> findAll() {
        List<Ware> tmp = wareMapper.selectByExample(null);
        List<Ware> list = new ArrayList<>();
        for (Ware ware:tmp) {
            if(ware.getIsaudit().equals(1)&&ware.getIsdelete().equals(0)){
               list.add(ware);
            }
        }
        return list;
    }

    @Override
    public Ware findOneById(Integer wareid) {
import com.woniu.gdj.entity.Wareinventory;
import com.woniu.gdj.mapper.WareMapper;
import com.woniu.gdj.mapper.WareinventoryMapper;
import com.woniu.gdj.service.IWareService;
import com.woniu.gdj.service.WareService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class WareServiceImpl implements WareService, IWareService {

    @Resource
    WareMapper wareMapper;
    @Resource
    private WareinventoryMapper wareinventoryMapper;
    //得到所有的商品信息
    @Override
    public List<Ware> getAllWares() {
        return wareMapper.selectByimageId();
    }

    //得到对应id的商品信息
    @Override
    public Ware selectByWareid(int wareid) {
        return wareMapper.selectByPrimaryKey(wareid);
    }

    @Override
    public List<Ware> findAll(String queryName) {
        return wareMapper.findByName(queryName);
    }

    @Override
    public void save(Ware ware,int wareinventorynumber) {
        wareMapper.insertSelective(ware);
        Wareinventory wareinventory = new Wareinventory();
        wareinventory.setWareinventory(wareinventorynumber);
        wareinventory.setWareid(ware.getWareid());
        wareinventory.setWareinputnumber(wareinventory.getWareinventory());
        wareinventory.setWareinputtime(new Date());
        wareinventoryMapper.insertSelective(wareinventory);
    }

    @Override
    public void update(Ware ware) {
    public void changeCheck(Ware ware) {
        wareMapper.updateByPrimaryKeySelective(ware);
    }

    @Override
    public List<Ware> getCheckWare() {
        WareExample example = new WareExample();
        WareExample.Criteria criteria = example.createCriteria();
        criteria.andIsauditEqualTo(0);

        List<Ware> list = wareMapper.selectByExample(example);
        return list;
    }

    @Override
    public void aUpdateWare(Ware ware) {
        wareMapper.updateByPrimaryKeySelective(ware);
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
