package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","model","controller","service","repository"})
@EntityScan({"com.example.demo","model","controller","service","repository"})
public class SpringBoot11Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot11Application.class, args);
	}

}
