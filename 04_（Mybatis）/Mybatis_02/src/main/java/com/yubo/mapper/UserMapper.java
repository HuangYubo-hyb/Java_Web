package com.yubo.mapper;


import com.yubo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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


    /*
    *
    * 根据id刪除用户
    *
    * */
    @Select("delete from user where id = #{id}")
    public User deleteById(Integer id);


    /**
     * 添加用户
     */
    @Insert("insert into user(username,password,name,age) values(#{username},#{password},#{name},#{age})")
    public void insert(User user);


    /*
    *
    * 修改用户
    *
    * */
    @Update("update user set username = #{username},password = #{password},name = #{name},age = #{age} where id = #{id}")
    public int update(User user);


    /*
    * 查詢指定id的用戶
    * */
    @Select("select * from user where id = #{id}")
    User selectById(int id);



}
