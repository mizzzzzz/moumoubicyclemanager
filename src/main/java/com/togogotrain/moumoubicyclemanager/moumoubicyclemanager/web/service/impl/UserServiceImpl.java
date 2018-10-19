package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.impl;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.User;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.UserExample;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.mappers.UserMapper;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public User getUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delUserById(List<Long> ids) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdIn(ids);
        return userMapper.deleteByExample(userExample);
    }

    @Override
    public int delUserByThisId(long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updataUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
