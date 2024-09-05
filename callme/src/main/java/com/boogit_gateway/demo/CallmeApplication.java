package com.boogit_gateway.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CallmeApplication {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CallmeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CallmeApplication.class, args);
	}
}
