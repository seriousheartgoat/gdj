package com.woniu.gdj;

import com.woniu.gdj.mapper.WareimageMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GdjApplicationTests {

    @Resource
    WareimageMapper wareimageMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void get(){
        System.out.println(wareimageMapper.selectByPrimaryKey(1));
    }


}
