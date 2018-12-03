package com.flown.springboot04.service;

import com.flown.springboot04.pojo.User;

public interface UserService {
    User findUserByName(String userName);
}
