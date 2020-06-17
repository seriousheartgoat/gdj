package com.woniu.gdj;

import com.github.pagehelper.PageHelper;
import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.service.IWareclassificationtypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GdjApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private IWareclassificationtypeService wtServiceImpl;
    @Test
    public void findAll(){

        PageHelper.startPage(1, 5);
        List<Wareclassificationtype> wtList = wtServiceImpl.findAll();
        System.out.println(wtList.size());


    }

}
