package com.yubo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {


//    @Test
//    public void testGetAge(){
//        Integer age = UserService.getAge("110002200505091218");
//        System.out.println(age);
//    }
//
//    @Test
//    public void testGetGender(){
//        Integer gender = UserService.getGender("110002200505091218");
//        System.out.println(gender);
//    }

//    断言
    @Test
    public void testGetAge(){
       Integer age = UserService.getAge("110002200505091218");
        Assertions.assertEquals(20, age);
    }

    @Test
    public void testGetGender(){
        Integer gender = UserService.getGender("110002200505091218");
        Assertions.assertEquals(1, gender);
    }


}
