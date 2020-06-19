package com.woniu.gdj.service;

import com.woniu.gdj.entity.Wareclassificationtype;

import java.util.List;

public interface WareclassificationtypeService {
    List<Wareclassificationtype> findAll();

    void aUpdateWareType(Wareclassificationtype wareType);
}
