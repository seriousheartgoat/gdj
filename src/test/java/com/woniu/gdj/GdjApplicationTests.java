package com.woniu.gdj;

import com.github.pagehelper.PageHelper;
import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.mapper.WareimageMapper;
import com.woniu.gdj.service.IWareclassificationtypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

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


    @Resource
    private IWareclassificationtypeService wtServiceImpl;


}
