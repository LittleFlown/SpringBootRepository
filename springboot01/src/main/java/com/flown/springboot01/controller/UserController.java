package com.flown.springboot01.controller;

import com.flown.springboot01.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /*@Value("${com.flown.name}")
    private String name;
    @Value("${com.flown.want}")
    private String want;
    @RequestMapping("")
    public String index() {
        return name + "," + want;
    }*/

    @Autowired
    private UserBean userBean;

    @RequestMapping("")
    public String index() {
        return userBean.getName() + "," + userBean.getWant();
    }
}
