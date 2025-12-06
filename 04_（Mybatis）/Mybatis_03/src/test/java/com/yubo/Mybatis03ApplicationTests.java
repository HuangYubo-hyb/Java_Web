package com.yubo;

import com.yubo.mapper.UserMapper;
import com.yubo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatis03ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);
    }

    @Test
    public void testFindById(){
        User user = userMapper.findById(3);
        System.out.println(user);
    }

    @Test
    public void testInsert(){
        User newUser = new User(null, "yubo", "huangyubo", "羽", 20);
        int result = userMapper.insert(newUser);
        System.out.println("插入成功，受影響行數：" + result);

        // 如果需要獲取插入後的User（包含自動生成的id）
        if(newUser.getId() != null) {
            System.out.println("插入的用戶：" + newUser);
        }
    }

    @Test
    public void testDelete(){
        int result = userMapper.deleteById(4);
        System.out.println("刪除成功，受影響行數：" + result);
    }

    @Test
    public void testUpdate(){
        User user = new User(3, "yubo", "huangyubo", "羽", 20);
        int result = userMapper.update(user);
        System.out.println("更新成功，受影響行數：" + result);
    }
}
