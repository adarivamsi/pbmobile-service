package com.adarivamsi.pbmobileservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PbmobileServiceApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(PbmobileServiceApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PbmobileServiceApplication.class, args);
	}

}
