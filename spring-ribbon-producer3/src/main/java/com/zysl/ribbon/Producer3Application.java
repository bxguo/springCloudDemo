package com.zysl.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Producer3Application {

	public static void main(String[] args) {
		SpringApplication.run(Producer3Application.class, args);
	}
}
