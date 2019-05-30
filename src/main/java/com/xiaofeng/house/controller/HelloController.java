package com.xiaofeng.house.controller;


import com.xiaofeng.house.common.model.User;
import com.xiaofeng.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("helloController")
    public String hello(ModelMap modelMap){
        List<User> userList = userService.getUsers();
        User user = userList.get(0);
        modelMap.put("user",user);
        return "hello";
    }
}
