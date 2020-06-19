package com.woniu.gdj.controller;

import com.woniu.gdj.entity.Checkentry;
import com.woniu.gdj.entity.Store;
import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.service.CheckentryService;
import com.woniu.gdj.service.StoreService;
import com.woniu.gdj.service.UserinfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Resource
    StoreService storeService;
    @Resource
    CheckentryService checkentryService;
    @Resource
    UserinfoService userinfoService;

    @GetMapping("getAllStore")
    public Map<String,Object> getAllStore(){
        Map<String,Object> map = new HashMap<>();
        List<Store> storelist = storeService.findAll();
        map.put("storelist",storelist);
        return map;
    }

    @PostMapping("commitAdminUpdateStore")
    public Map<String,Object> commitAdminUpdateStore(Store store){
        Map<String,Object> map = new HashMap<>();
        storeService.aUpdateStore(store);
        map.put("msg",true);
        return map;
    }

    @GetMapping("getCheckStore")
    public Map<String,Object> getCheckStore(){
        Map<String,Object> map = new HashMap<>();
        List<Checkentry> checkEntrylist = checkentryService.getAllCheck();
        map.put("checkEntrylist",checkEntrylist);
        map.put("msg",true);
        return map;
    }

    @PostMapping("passCheck")
    public Map<String,Object> passCheck(Integer checkentryid){
        Map<String,Object> map = new HashMap<>();
        Checkentry checkentry = checkentryService.findOneById(checkentryid);
        checkentry.setIscheck(1);
        checkentryService.changeCheck(checkentry);

        Userinfo userinfo = userinfoService.findOneByID(checkentry.getUserid());

        Store store = new Store();
        store.setStoreman(userinfo.getUsername());
        store.setStorename(userinfo.getUsername());
        store.setStoremanphone(checkentry.getStoremanphone());
        store.setStorephone(checkentry.getStorephone());
        store.setStoreaddress(checkentry.getStoreaddress());
        storeService.add(store);
        map.put("msg",true);
        return map;
    }

    @PostMapping("refuseCheck")
    public Map<String,Object> refuseCheck(Integer checkentryid){
        Map<String,Object> map = new HashMap<>();
        Checkentry checkentry = checkentryService.findOneById(checkentryid);
        checkentry.setIscheck(2);
        checkentryService.changeCheck(checkentry);
        map.put("msg",true);
        return map;
    }
}
