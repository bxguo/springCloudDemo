package com.zysl.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerDemoApplication {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(SpringEurekaServerDemoApplication.class).web(true).run(args);
        SpringApplication.run(SpringEurekaServerDemoApplication.class, args);
    }

}

