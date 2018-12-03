package com.flown.springboot04.controller;

import com.flown.springboot04.pojo.User;
import com.flown.springboot04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{userName}")
    public User getUser(@PathVariable(value = "userName") String userName){
        User user = userService.findUserByName(userName);
        return user;
    }
}
