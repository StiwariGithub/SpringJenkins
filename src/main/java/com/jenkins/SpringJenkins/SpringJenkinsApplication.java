package com.jenkins.SpringJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);
	public void init(){
		logger.debug("Inside inint::");
	}

	public static void main(String[] args) {
		logger.debug("Application Started::");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}