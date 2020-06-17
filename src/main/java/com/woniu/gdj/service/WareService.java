package com.woniu.gdj.service;

import com.woniu.gdj.entity.Ware;

import java.util.List;

public interface WareService {

    List<Ware> getAllWares();

    Ware selectByWareid(int wareid);
}
