package com.aliyun.skywalkingcomplexdemo.service;

import com.aliyun.skywalkingcomplexdemo.mapper.UserMapper;
import com.aliyun.skywalkingcomplexdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public User getUserById(int id) {
    return userMapper.selectUserById(id);
  }

}
