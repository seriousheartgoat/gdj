package com.woniu.gdj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.woniu.gdj.mapper")
public class GdjApplication {

    public static void main(String[] args) {
        SpringApplication.run(GdjApplication.class, args);
    }

}
