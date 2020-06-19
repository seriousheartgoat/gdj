package com.woniu.gdj.service.impl;

import com.woniu.gdj.entity.Merchartorder;
import com.woniu.gdj.entity.MerchartorderExample;
import com.woniu.gdj.mapper.MerchartorderMapper;
import com.woniu.gdj.service.IMercharorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cjw
 * @create 2020/06/17 00:55:43
 */
@Service
public class MercharorderImpl implements IMercharorderService {
    @Resource
    private MerchartorderMapper merchartorderMapper;

    @Override
    public void save(Merchartorder merchartorder) {
        merchartorderMapper.insertSelective(merchartorder);
    }

    @Override
    public List<Merchartorder> findAll(Merchartorder merchartorder,int orderstateid) {
        Map map = new HashMap();
        map.put("merchartid",merchartorder.getMerchartid());
        if (0!=orderstateid){
            if (1==orderstateid){
                map.put("orderstate","已支付");
            }else if(2==orderstateid){
                map.put("orderstate","已发货");
            }else{
                map.put("orderstate","已签收");
            }
        }
        return merchartorderMapper.selectByMerchart(map);
    }

    @Override
    public void send(Merchartorder merchartorder) {
        merchartorder.setOrderstate("已发货");
        merchartorderMapper.updateByPrimaryKeySelective(merchartorder);
    }
}
