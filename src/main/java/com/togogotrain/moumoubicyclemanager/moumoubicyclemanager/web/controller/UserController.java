package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.controller;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.User;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.format.Result;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUserList")
    public Result<List<User>> getUserList() {
        List<User> userList = userService.getUserList();
        return new Result<List<User>>("0000", "success", userList);
    }

    @ResponseBody
    @RequestMapping("/getUserById")
    public Result<User> getUserById(Long id) {
        User user = userService.getUserById(id);
        if (id == null) {
            return new Result<User>("1001", "参数错误", null);
        }
        return new Result<User>("0000", "success", user);
    }

    @ResponseBody
    @RequestMapping("/delUserById")
    public Result<Integer> delUserById(@RequestParam("ids") List<Long> ids) {
        if (ids == null) {
            return new Result<>("1001", "参数错误", null);
        }
        return new Result<>("0000", "success", userService.delUserById(ids));
    }

    @ResponseBody
    @RequestMapping("/delUserByThisId")
    public Result<Integer> delUserByThisId(Long id) {
        if (id == null) {
            return new Result<>("1001", "参数错误", null);
        }
        return new Result<>("0000", "success", userService.delUserByThisId(id));
    }

    @ResponseBody
    @RequestMapping(value ="/updataUser",method = RequestMethod.POST)
    public Result<Integer> updataUser(@RequestBody User user){
        if (user.getPhone() == null) {
            return new Result<>("1001", "参数错误", null);
        }
        /*User user = new User();
        user.setId(id);
        user.setPhone(phone);
        user.setMoney(money);
        user.setHasdeposit(hasDeposit);
        */
        return new Result<>("0000", "success", userService.updataUser(user));
    }
    @ResponseBody
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Result<Integer> addUser(@RequestBody User user){
        if (user.getPhone() == null||user.getWxopenid()==null) {
            return new Result<>("1001", "参数错误", null);
        }
        return new Result<>("0000", "success", userService.addUser(user));
    }
}