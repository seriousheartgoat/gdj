package com.woniu.gdj.service;

import com.woniu.gdj.entity.Store;

import java.util.List;

public interface StoreService {
    List<Store> findAll();

    void aUpdateStore(Store store);
}
