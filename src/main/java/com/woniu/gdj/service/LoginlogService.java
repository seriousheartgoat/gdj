package com.woniu.gdj.service;

import com.woniu.gdj.entity.Loginlog;

import java.util.List;

public interface LoginlogService {
    List<Loginlog> findAll();

    void add(Loginlog loginlog);

    Loginlog findOneByID(Integer loginLogID);

    void update(Loginlog loginlog);
}
