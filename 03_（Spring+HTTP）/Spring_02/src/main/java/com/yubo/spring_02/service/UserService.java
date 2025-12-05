package com.yubo.spring_02.service;

import com.yubo.spring_02.pojo.User;

import java.util.List;

public interface UserService {

    /*
    *
    * 查询所有用户
    *
    * */
    public List<User> findAll();
}
