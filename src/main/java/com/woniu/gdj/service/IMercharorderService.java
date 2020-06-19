package com.woniu.gdj.service;

import com.woniu.gdj.entity.Merchartorder;

import java.util.List;

/**
 * @author cjw
 * @create 2020/06/17 00:55:04
 */
public interface IMercharorderService {
    void save(Merchartorder merchartorder);

    List<Merchartorder> findAll(Merchartorder merchartorder,int orderstateid);

    void send(Merchartorder merchartorder);
}
