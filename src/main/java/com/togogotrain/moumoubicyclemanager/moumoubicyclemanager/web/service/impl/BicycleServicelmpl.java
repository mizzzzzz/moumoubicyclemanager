package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.impl;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Bicycle;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.BicycleExample;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.mappers.BicycleMapper;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.BicycleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BicycleService")
public class BicycleServicelmpl implements BicycleService {
    @Resource
    private BicycleMapper bicycleMapper;
    @Override
    public int delBicycleByThisId(long id) {
        return bicycleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updataBicycle(Bicycle bicycle) {
        return bicycleMapper.updateByPrimaryKeySelective(bicycle);
    }

    @Override
    public int addBicycle(Bicycle bicycle) {
        return bicycleMapper.insertSelective(bicycle);
    }

    @Override
    public List<Bicycle> getBicycleList() {
        return bicycleMapper.selectByExample(new BicycleExample());
    }
}
