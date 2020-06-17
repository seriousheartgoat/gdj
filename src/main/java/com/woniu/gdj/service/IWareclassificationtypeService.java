package com.woniu.gdj.service;

import com.woniu.gdj.entity.Wareclassificationtype;

import java.util.List;

/**
 * @author cjw
 * @create 2020/06/08 16:25:44
 */
public interface IWareclassificationtypeService {
    List<Wareclassificationtype> findAll();

    void save(Wareclassificationtype wt);

    void update(Wareclassificationtype wt);

    void delete(int wareClassificationTypeID);

    Wareclassificationtype findById(int wareClassificationTypeID);
}
