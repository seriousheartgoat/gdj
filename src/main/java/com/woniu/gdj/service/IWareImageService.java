package com.woniu.gdj.service;

import com.woniu.gdj.entity.Wareimage;

import java.util.List;

/**
 * @author cjw
 * @create 2020/06/10 17:33:32
 */
public interface IWareImageService {
    List<Wareimage> findAll(Wareimage wareimage);

    void save(Wareimage wareimage);

    void update(Wareimage wareimage);

    void delete(int wareimageid);

    Wareimage findById(int wareimageid);
}
