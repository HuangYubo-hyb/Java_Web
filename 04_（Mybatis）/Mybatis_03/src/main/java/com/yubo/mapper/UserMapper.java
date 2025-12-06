package com.yubo.mapper;

import com.yubo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //查詢全部用戶
    List<User> findAll();

    //根據id查詢用戶
    User findById(int id);

    // insert 返回受影響的行數（通常是1）
    int insert(User user);

    // delete 返回受影響的行數
    int deleteById(Integer id);

    // update 返回受影響的行數
    int update(User user);
}
