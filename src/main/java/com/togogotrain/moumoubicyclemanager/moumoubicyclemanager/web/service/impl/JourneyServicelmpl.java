package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.impl;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Journey;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.JourneyExample;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.mappers.JourneyMapper;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.JourneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("JourneyService")
public class JourneyServicelmpl implements JourneyService {
    @Resource
    private JourneyMapper journeyMapper;
    @Override
    public List<Journey> getJourneyList() {
        return journeyMapper.selectByExample(new JourneyExample());
    }

}
