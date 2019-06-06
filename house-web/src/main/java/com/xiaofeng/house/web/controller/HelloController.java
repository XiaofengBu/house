package com.xiaofeng.house.web.controller;


import com.xiaofeng.house.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("helloController")
    public String hello(){
        return "homepage/index";
    }
}
