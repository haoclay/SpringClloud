package com.softeem.controller;

import com.softeem.feigninterface.IUserClient;
import com.softeem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/8 21:51
 * @version: v1.0
 */
@RestController
@RequestMapping("/user")
public class USerController {

    @RequestMapping("/findAll")
    public Object finduser(){
        //模拟用户查询信息
        List<User> users = new ArrayList<User>();
        User user1 = new User(1111, "苍老师", "女");
        User user2 = new User(2222, "加藤老师", "男");

        users.add(user1);
        users.add(user2);

        //int i =1/0;
        return users;
    }

    @RequestMapping("/findTwo")
    public Object findTwoPerson(){
        //模拟用户查询信息
        List<User> users = new ArrayList<User>();
        User user = new User(1234, "波多老师", "女");
        users.add(user);
        return users;
    }

}
