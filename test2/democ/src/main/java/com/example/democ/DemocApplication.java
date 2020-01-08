package com.example.democ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableEurekaClient   //表明这是一个Eureka客户端：并将当前服务注册到Eureka上
@EnableDiscoveryClient
@SpringBootApplication
public class DemocApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemocApplication.class, args);
    }

}
