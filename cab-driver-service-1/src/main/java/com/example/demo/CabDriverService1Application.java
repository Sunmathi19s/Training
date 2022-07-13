package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CabDriverService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CabDriverService1Application.class, args);
	}

}
