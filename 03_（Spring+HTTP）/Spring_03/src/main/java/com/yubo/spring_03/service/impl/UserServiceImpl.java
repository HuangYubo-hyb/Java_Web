package com.yubo.spring_03.service.impl;

import com.yubo.spring_03.dao.UserDao;
import com.yubo.spring_03.dao.impl.UserDaoImpl;
import com.yubo.spring_03.pojo.User;
import com.yubo.spring_03.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service// 将类交给Ioc管理
public class UserServiceImpl implements Userservice {

    @Autowired// 应用程序启动时，Spring Ioc容器会创建UserServiceImpl对象，并注入到UserServiceImpl对象中
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        //1.調取DAO，加载并读取 user.txt 文件
        List<String> lines = userDao.findAll();

        //2.解析数据，封装成对象 --> 集合
        List<User> userList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String username = parts[1];
            String password = parts[2];
            String name = parts[3];
            Integer age = Integer.parseInt(parts[4]);
            LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            return new User(id, username, password, name, age, updateTime);
        }).toList();

        return userList;
    }

}
