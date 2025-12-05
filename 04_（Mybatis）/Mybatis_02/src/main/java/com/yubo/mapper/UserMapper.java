package com.yubo.mapper;


import com.yubo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // 告诉Mybatis，这是一个操作数据库的Mapper，会自动生成接口的实现类，并且会自动将该实现类存入IOC容器中，成为bean
public interface UserMapper {

    /*
    *
    * 查询所有用户
    *
    * */
    @Select("select * from user")
    public List<User> findAll();

}
