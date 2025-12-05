package com.yubo.spring_03.service;

import com.yubo.spring_03.pojo.User;

import java.util.List;

public interface Userservice {

    /*
     *
     * 查询所有用户
     *
     * */
    public List<User> findAll();
}
