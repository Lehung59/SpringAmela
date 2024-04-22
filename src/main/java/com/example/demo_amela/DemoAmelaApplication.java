package com.example.demo_amela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAmelaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoAmelaApplication.class, args);
		UserActionPublisher publisher = context.getBean(UserActionPublisher.class);
		publisher.publishEvent("User logged in");
	}
	}


