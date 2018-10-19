package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Bicycle;

import java.util.List;

public interface BicycleService {
    public int delBicycleByThisId(long id);//删
    public int updataBicycle(Bicycle bicycle);//改
    public int addBicycle(Bicycle bicycle);//增

    public List<Bicycle> getBicycleList();
}
