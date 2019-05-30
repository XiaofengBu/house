package com.xiaofeng.house.service;

import com.xiaofeng.house.common.model.User;
import com.xiaofeng.house.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


  @Autowired
  private UserMapper userMapper;

  public List<User> getUsers() {
    return userMapper.selectUsers();
  }
}
