package com.yubo.spring_03.dao;

import java.util.List;

public interface UserDao {

    /*
     *
     * 加載用戶數據
     *
     * */
    List<String> findAll();
}
