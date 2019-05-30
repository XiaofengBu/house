package com.xiaofeng.house.controller;

import com.xiaofeng.house.common.model.User;
import com.xiaofeng.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("user")
  public List<User> getUsers(){
    return userService.getUsers();
  }

}
