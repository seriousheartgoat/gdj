package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Store;
import com.woniu.gdj.mapper.StoreMapper;
import com.woniu.gdj.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Resource
    StoreMapper storeMapper;

    @Override
    public List<Store> findAll() {
        List<Store> list = storeMapper.selectByExample(null);
        return list;
    }

    @Override
    public void aUpdateStore(Store store) {
        System.out.println("impl"+store.getStoreaddress());
        storeMapper.updateByPrimaryKeySelective(store);
    }
}
