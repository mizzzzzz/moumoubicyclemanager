package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();
    public User getUserById(long id);
    public int delUserById(List<Long> ids);

    public int delUserByThisId(long id);//删
    public int updataUser(User user);//改
    public int addUser(User user);//增
}
