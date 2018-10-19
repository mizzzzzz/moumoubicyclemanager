package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.impl;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Admin;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.AdminExample;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.mappers.AdminMapper;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServicelmpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    @Override
    public boolean hasAdmin(String name, String password) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andNameEqualTo(name);
        criteria.andPasswordEqualTo(password);
        List admins= adminMapper.selectByExample(adminExample);
//        System.out.println(admins);
        boolean a = true;
        if (!admins.isEmpty())
        {
            return true;
        }else {
            return false;
        }
    }
}
