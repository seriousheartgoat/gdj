package com.woniu.gdj.service;

import com.woniu.gdj.entity.Wareinventory;

import java.util.List;

/**
 * @author cjw
 * @create 2020/06/12 15:56:12
 */
public interface IwareInventoryService {
    List<Wareinventory> findAll(Wareinventory wareinventory);

    void update(Wareinventory wareinventory);
}
