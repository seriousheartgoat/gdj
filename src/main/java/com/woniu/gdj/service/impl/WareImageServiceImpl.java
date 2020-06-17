package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Wareimage;
import com.woniu.gdj.entity.WareimageExample;
import com.woniu.gdj.mapper.WareimageMapper;
import com.woniu.gdj.service.IWareImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cjw
 * @create 2020/06/10 17:33:53
 */
@Service
public class WareImageServiceImpl implements IWareImageService {
    @Resource
    private WareimageMapper wareimageMapper;

    @Override
    public List<Wareimage> findAll(Wareimage wareimage) {
        WareimageExample wareimageExample = new WareimageExample();
        WareimageExample.Criteria criteria = wareimageExample.createCriteria();
        if(0!=wareimage.getWareid()){
            criteria.andWareidEqualTo(wareimage.getWareid());
        }
        return wareimageMapper.selectByWareId(wareimageExample);
    }

    @Override
    public void save(Wareimage wareimage) {
        wareimageMapper.insertSelective(wareimage);
    }

    @Override
    public void update(Wareimage wareimage) {
        wareimageMapper.updateByPrimaryKeySelective(wareimage);
    }

    @Override
    public void delete(int wareimageid) {
        wareimageMapper.deleteByPrimaryKey(wareimageid);
    }

    @Override
    public Wareimage findById(int wareimageid) {

        return wareimageMapper.selectwareimageid(wareimageid);
    }
}
