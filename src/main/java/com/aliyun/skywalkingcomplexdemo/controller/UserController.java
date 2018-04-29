package com.aliyun.skywalkingcomplexdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.skywalkingcomplexdemo.pojo.User;
import com.aliyun.skywalkingcomplexdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/showUser", method = RequestMethod.GET)
  public String findUser(@RequestParam(value = "id") Integer id) {
    User user = userService.getUserById(id);
    return JSONObject.toJSONString(user);
  }

}
