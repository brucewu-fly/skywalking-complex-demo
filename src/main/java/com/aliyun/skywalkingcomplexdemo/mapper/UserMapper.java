package com.aliyun.skywalkingcomplexdemo.mapper;

import com.aliyun.skywalkingcomplexdemo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapper {

  @Autowired
  private SqlSessionTemplate sqlSessionTemplate;

  public User selectUserById(int id) {
    return this.sqlSessionTemplate.selectOne("selectUserById", id);
  }

}
