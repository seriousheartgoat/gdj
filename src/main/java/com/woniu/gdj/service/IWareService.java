package com.woniu.gdj.service;

import com.woniu.gdj.entity.Ware;

import java.util.List;

/**
 * @author cjw
 * @create 2020/06/08 17:38:40
 */
public interface IWareService {
    List<Ware> findAll();

    void save(Ware ware);

    void update(Ware ware);

    void delete(int wareId);

    Ware findById(int wareId);

    List<Ware> list();
}
