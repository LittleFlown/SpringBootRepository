package com.flown.springboot04.dao;

import com.flown.springboot04.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long>{
    User findByUserName(String userName);
}
