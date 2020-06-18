package com.woniu.gdj.service;

import com.woniu.gdj.entity.Merchart;

import java.util.List;

/**
 * @author cjw
 * @create 2020/06/12 14:06:33
 */
public interface IMerchartService {
    List<Merchart> findAll(String queryName);

    List<Merchart> list();
}
