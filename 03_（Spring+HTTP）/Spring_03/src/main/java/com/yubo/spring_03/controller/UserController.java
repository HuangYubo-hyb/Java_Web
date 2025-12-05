package com.yubo.spring_03.controller;


import com.yubo.spring_03.pojo.User;
import com.yubo.spring_03.service.Userservice;
import com.yubo.spring_03.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired// 应用程序启动时，Spring Ioc容器会创建UserServiceImpl对象，并注入到UserServiceImpl对象中
    private Userservice userService;

    @RequestMapping("/list")
    public List<User> list() {

        //1.调用业务层Service，获取数据
        List<User> userList = userService.findAll();

        //2.响应数据
        //return JSONUtil.toJsonStr(userList, JSONConfig.create().setDateFormat("yyyy-MM-dd HH:mm:ss"));
        return userList;
    }
}
