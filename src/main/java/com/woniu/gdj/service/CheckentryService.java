package com.woniu.gdj.service;

import com.woniu.gdj.entity.Checkentry;

import java.util.List;

public interface CheckentryService {
    List<Checkentry> getAllCheck();

    Checkentry findOneById(Integer checkentryid);

    void changeCheck(Checkentry checkentry);
}
