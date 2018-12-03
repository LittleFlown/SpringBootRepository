package com.flown.springboot04.service.impl;

import com.flown.springboot04.dao.UserDao;
import com.flown.springboot04.pojo.User;
import com.flown.springboot04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String userName) {
        return userDao.findByUserName(userName);
    }
}
