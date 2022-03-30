package com.jenkins.SpringJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);
	public void init(){
		logger.info("Inside in int 1st app::");
	}

	public static void main(String[] args) {
		logger.info("SpringJenkinsApplication Started::");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
