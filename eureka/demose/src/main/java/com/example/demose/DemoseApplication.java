package com.example.demose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //表明这是一个Eureka服务端
public class DemoseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoseApplication.class, args);
    }

}
