package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.controller;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Bicycle;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.format.Result;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BicycleController {
    @Autowired
    private BicycleService bicycleService;

    @ResponseBody
    @RequestMapping("/getBicycleList")
    public Result<List<Bicycle>> getBicycleList() {
        List<Bicycle> userList = bicycleService.getBicycleList();
        return new Result<List<Bicycle>>("0000", "success", userList);
    }

    @ResponseBody
    @RequestMapping("/delBicycleByThisId")
    public Result<Integer> delBicycleByThisId(Long id) {
        if (id == null) {
            return new Result<>("1001", "参数错误", null);
        }
        return new Result<>("0000", "success", bicycleService.delBicycleByThisId(id));
    }

    @ResponseBody
    @RequestMapping(value ="/updataBicycle",method = RequestMethod.POST)
    public Result<Integer> updataBicycle(@RequestBody Bicycle bicycle){
        if (bicycle.getStatus() == null) {
            return new Result<>("1001", "参数错误", null);
        }
        return new Result<>("0000", "success", bicycleService.updataBicycle(bicycle));
    }
    @ResponseBody
    @RequestMapping(value = "/addBicycle",method = RequestMethod.POST)
    public Result<Integer> addBicycle(@RequestBody Bicycle bicycle){
        if (bicycle.getMark() == null) {
            return new Result<>("1001", "参数错误", null);
        }
        return new Result<>("0000", "success", bicycleService.addBicycle(bicycle));
    }
}
