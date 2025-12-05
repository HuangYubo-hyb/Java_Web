package com.yubo.spring_02.service.impl;

import com.yubo.spring_02.dao.UserDao;
import com.yubo.spring_02.dao.impl.UserDaoImpl;
import com.yubo.spring_02.pojo.User;
import com.yubo.spring_02.service.UserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserServiceImpl implements UserService {


    private UserDao userDao = new UserDaoImpl();
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
