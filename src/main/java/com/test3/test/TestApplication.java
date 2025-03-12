package com.test3.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		String name = "mike";
		SpringApplication.run(TestApplication.class, args);
	}

}
