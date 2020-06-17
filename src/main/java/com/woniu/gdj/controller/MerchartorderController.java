package com.woniu.gdj.controller;

import com.woniu.gdj.service.IMercharorderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cjw
 * @create 2020/06/17 00:59:25
 */
@RestController
@RequestMapping("/Merchartorder")
public class MerchartorderController {
    @Resource
    private IMercharorderService mercharorderServiceImpl;
}
