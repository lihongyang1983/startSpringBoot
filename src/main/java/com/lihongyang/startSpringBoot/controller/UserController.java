package com.lihongyang.startSpringBoot.controller;

import com.lihongyang.startSpringBoot.bean.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/searchUser", method = RequestMethod.POST)
    public User searchUser(@RequestBody User user) {

        System.out.println(user.getName());
        User user1 = new User();
        user1.setName("aaa");
        return user1;

    }

}
