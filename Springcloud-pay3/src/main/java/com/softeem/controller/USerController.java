package com.softeem.controller;

import com.softeem.pojo.User;
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
        User user1 = new User(8888, "博多老师", "女");
        User user2 = new User(9999, "桃谷老师", "女");
        User user3 = new User(1010, "大桥老师", "女");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
