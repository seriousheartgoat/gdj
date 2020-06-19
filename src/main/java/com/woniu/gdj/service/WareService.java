package com.woniu.gdj.service;

import com.woniu.gdj.entity.Ware;

import java.util.List;

public interface WareService {
    List<Ware> findAll();

    Ware findOneById(Integer wareid);

    void changeCheck(Ware ware);

    List<Ware> getCheckWare();

    void aUpdateWare(Ware ware);
}
