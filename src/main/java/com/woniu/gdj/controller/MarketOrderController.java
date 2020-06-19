package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Marketsorder;
import com.woniu.gdj.service.MarketOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/marketOrder")
public class MarketOrderController {

    @Resource
    MarketOrderService marketOrderService;

    @GetMapping("getAllOrder")
    public Map<String,Object> getAllOrder(){
        Map<String,Object> map = new HashMap<>();
        List<Marketsorder> orderlist = marketOrderService.findAll();

        map.put("orderlist",orderlist);
        return map;
    }
}
