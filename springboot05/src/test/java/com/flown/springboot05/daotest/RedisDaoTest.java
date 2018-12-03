package com.flown.springboot05.daotest;

import com.flown.springboot05.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {

    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis(){

        redisDao.setKey("flown","无敌");
        System.out.println(redisDao.getValue("flown"));
    }
}
