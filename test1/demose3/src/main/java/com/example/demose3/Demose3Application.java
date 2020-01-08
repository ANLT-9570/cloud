package com.example.demose3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Demose3Application {

    public static void main(String[] args) {
        SpringApplication.run(Demose3Application.class, args);
    }

}
