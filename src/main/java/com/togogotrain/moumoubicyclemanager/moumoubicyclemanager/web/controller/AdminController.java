package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.controller;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Admin;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/doLogin")
    public boolean doLogin(String name,String password) {
        System.out.println(adminService.hasAdmin(name,password));
        return adminService.hasAdmin(name,password);
    }
}
