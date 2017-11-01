package com.fyp.layim.service;

import com.fyp.layim.domain.User;
import com.fyp.layim.domain.result.JsonResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author fyp
 * @crate 2017/11/1 23:20
 * @project SpringBootLayIM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setAvatar("http://my.avatar");
        user.setSign("这个是我的签名");
        user.setUserName("张三");
        JsonResult res = userService.addUser(user);
        Assert.assertEquals(Integer.valueOf(0),res.getCode());
    }
}