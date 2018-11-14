package com.flown.springboot01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*@ConfigurationProperties(prefix = "com.flown")*/
@Configuration
@ConfigurationProperties(prefix = "com.fei")
@PropertySource("classpath:test.properties")
public class UserBean {

    private String name;
    private String want;

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
