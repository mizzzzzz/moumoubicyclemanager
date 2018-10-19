package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToPageController {

    @RequestMapping("/test")
    public String test() {
        return "index";
    }
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    @RequestMapping("/user")
    public String user() {
        return "user";
    }
    @RequestMapping("/bicycle")
    public String bicyle() {
        return "bicycle";
    }
    @RequestMapping("/journey")
    public String journey() {
        return "journey";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }



}
