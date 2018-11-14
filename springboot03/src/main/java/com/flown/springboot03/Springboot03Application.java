package com.flown.springboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springboot03Application /*extends SpringBootServletInitializer*/ {

	public static void main(String[] args) {
		SpringApplication.run(Springboot03Application.class, args);
	}
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Springboot03Application.class);
	}*/
}
