package com.flown.springboot05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 赋值
     * @param key
     * @param value
     */
    public void setKey(String key, String value){

        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value,1, TimeUnit.MINUTES); // 一分钟过期
    }

    /**
     * 获取值
     * @param key
     * @return
     */
    public String getValue(String key){

        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        return  valueOperations.get(key);
    }
}
