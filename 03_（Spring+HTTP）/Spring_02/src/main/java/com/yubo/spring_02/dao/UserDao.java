package com.yubo.spring_02.dao;

import cn.hutool.core.io.IoUtil;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public interface UserDao {


    /*
    *
    * 加載用戶數據
    *
    * */
    List<String> findAll();
}
