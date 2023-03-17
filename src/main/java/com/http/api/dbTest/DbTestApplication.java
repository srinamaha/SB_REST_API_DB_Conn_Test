package com.http.api.dbTest;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class DbTestApplication {

	private static final Logger LOGGER = LogManager.getLogger(Application.class);
	public static void main(String[] args) {
		LOGGER.info("Application Started ...");
		SpringApplication.run(DbTestApplication.class, args);
	}

}
