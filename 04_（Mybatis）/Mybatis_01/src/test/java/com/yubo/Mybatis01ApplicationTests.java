package com.yubo;

import com.yubo.mapper.UserMapper;
import com.yubo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatis01ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFindAll() {
		List<User> users = userMapper.findAll();
		users.forEach(System.out::println);
	}

}
