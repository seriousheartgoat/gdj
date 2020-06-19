package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Checkentry;
import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.entity.Warespec;
import com.woniu.gdj.service.WareService;
import com.woniu.gdj.service.WareclassificationtypeService;
import com.woniu.gdj.service.WarespecService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ware")
public class WareController {
    @Resource
    WareService wareService;
    @Resource
    WareclassificationtypeService wareclassificationtypeService;
    @Resource
    WarespecService warespecService;

    @GetMapping("getAllWare")
    public Map<String,Object> getAllWare(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Ware> warelist = wareService.findAll();
        map.put("warelist",warelist);
        map.put("msg",true);
        return map;
    }

    @GetMapping("getAllWareType")
    public Map<String,Object> getAllWareType(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Wareclassificationtype> wareTypelist = wareclassificationtypeService.findAll();
        map.put("wareTypelist",wareTypelist);
        map.put("msg",true);
        return map;
    }

    @GetMapping("getAllWareSpec")
    public Map<String,Object> getAllWareSpec(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Warespec> wareSpeclist = warespecService.findAll();
        map.put("wareSpeclist",wareSpeclist);
        map.put("msg",true);
        return map;
    }

    @PostMapping("passCheck")
    public Map<String,Object> passCheck(Integer wareid){
        Map<String,Object> map = new HashMap<>();
        Ware ware = wareService.findOneById(wareid);
        ware.setIsaudit(1);
        wareService.changeCheck(ware);
        map.put("msg",true);
        return map;
    }

    @PostMapping("refuseCheck")
    public Map<String,Object> refuseCheck(Integer wareid){
        Map<String,Object> map = new HashMap<>();
        Ware ware = wareService.findOneById(wareid);
        ware.setIsaudit(2);
        wareService.changeCheck(ware);
        map.put("msg",true);
        return map;
    }

    @GetMapping("getCheckWare")
    public Map<String,Object> getCheckWare(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Ware> checkWarelist = wareService.getCheckWare();
        map.put("checkWarelist",checkWarelist);
        map.put("msg",true);
        return map;
    }

    @PostMapping("commitAdminUpdateWare")
    public Map<String,Object> commitAdminUpdateWare(Ware ware){
        Map<String,Object> map = new HashMap<>();
        ware.setLasteditdt(new Date(new Date().getTime()));
        wareService.aUpdateWare(ware);
        map.put("msg",true);
        return map;
    }

    @PostMapping("deleteWare")
    public  Map<String,Object> deleteWare(Integer wareid){
        Map<String,Object> map = new HashMap<>();
        Ware ware = wareService.findOneById(wareid);
        ware.setIsdelete(1);
        wareService.aUpdateWare(ware);
        map.put("msg",true);
        return map;
    }

}
