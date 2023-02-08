package com.pro30;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Pro30Application {

	public static void main(String[] args) {
		SpringApplication.run(Pro30Application.class, args);
	}

}
