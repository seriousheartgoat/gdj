package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Wareinventory;
import com.woniu.gdj.entity.WareinventoryExample;
import com.woniu.gdj.mapper.WareinventoryMapper;
import com.woniu.gdj.service.IwareInventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cjw
 * @create 2020/06/12 15:56:25
 */
@Service
public class WareInventoryServiceImpl implements IwareInventoryService {
    @Resource
    private WareinventoryMapper wareinventoryMapper;

    @Override
    public List<Wareinventory> findAll(Wareinventory wareinventory) {
        Map map = new HashMap();
        if(0!=wareinventory.getWareid()){
            map.put("wareid",wareinventory.getWareid());
        }
        if(null!=wareinventory.getWareinputtime()){
            map.put("wareinputtime",wareinventory.getWareinputtime());
        }
        if(null!=wareinventory.getWareoutputtime()){
            map.put("wareoutputtime",wareinventory.getWareoutputtime());
        }
        return wareinventoryMapper.selectByWareId(map);
    }

    @Override
    public void update(Wareinventory wareinventory) {
        Wareinventory w = wareinventoryMapper.findByWareid(wareinventory.getWareid());
        wareinventory.setWareinventoryid(w.getWareinventoryid());
        wareinventoryMapper.updateByPrimaryKeySelective(wareinventory);
    }
}
