package com.yubo;

import com.yubo.mapper.UserMapper;
import com.yubo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatis02ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFindAll() {
		List<User> users = userMapper.findAll();
		users.forEach(System.out::println);
	}

	@Test
	public void deleteById() {
		User user = userMapper.deleteById(1);
		System.out.println(user);
	}

	@Test
	public void testInsert() {
		User user = new User(null, "yubo", "123456", "yubo", 18);
		userMapper.insert(user);
		System.out.println(user);
	}

	@Test
	public void testUpdate() {
		User user = new User(2, "yubo", "123456", "yubo", 18);
		int updateRows = userMapper.update(user);
		System.out.println(updateRows);
	}

	@Test
	public void testSelectById(){
		User user = userMapper.selectById(3);
		System.out.println(user);
	}


}
