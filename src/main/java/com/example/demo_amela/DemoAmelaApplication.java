package com.example.demo_amela;

import com.example.demo_amela.model.LocalDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

import java.util.Scanner;

@SpringBootApplication
public class DemoAmelaApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DemoAmelaApplication.class, args);
//	}
public static void main(String[] args) {
	String evn = "dev";
	SpringApplication application = new SpringApplication(DemoAmelaApplication.class);
	ConfigurableEnvironment environment = new StandardEnvironment();


	environment.setActiveProfiles(evn); // Chỉnh profile ở đây
	application.setEnvironment(environment);
	ApplicationContext context = application.run(args);


	System.out.println("run "+evn);
}
}
