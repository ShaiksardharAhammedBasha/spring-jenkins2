package com.spring;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootproWithJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootproWithJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Spring Boot Application With Post COnstructor Method ");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootproWithJenkinsApplication.class, args);
		logger.info("main method of App");
	}

}
