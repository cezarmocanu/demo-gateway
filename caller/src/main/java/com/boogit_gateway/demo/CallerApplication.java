package com.boogit_gateway.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.server.resource.web.reactive.function.client.ServletBearerExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CallerApplication {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CallerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CallerApplication.class, args);
	}

	@Bean
	public WebClient webClient() {
		return WebClient.builder()
				.filter(new ServletBearerExchangeFilterFunction())
				.build();
	}
}
