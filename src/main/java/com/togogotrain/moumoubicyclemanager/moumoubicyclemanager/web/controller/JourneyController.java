package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.controller;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Journey;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.format.Result;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JourneyController {
    @Autowired
    private JourneyService journeyService;

    @ResponseBody
    @RequestMapping("/getJourneyList")
    public Result<List<Journey>> getJourneyList() {
        List<Journey> journeyList = journeyService.getJourneyList();
        return new Result<List<Journey>>("0000", "success", journeyList);
    }
}
