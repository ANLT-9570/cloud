package com.example.democ.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/info")
    public List<String> info(){
        List<String> services = new ArrayList<>();
//        String description = discoveryClient.description();
        List<String> list = discoveryClient.getServices();
        for (int i = 0; i < list.size(); i++) {

            List<ServiceInstance> instances = discoveryClient.getInstances(list.get(i));

            log.info(">>>>>>>>>>>>>>"+list.get(i));
            for(ServiceInstance serviceInstance : instances){
                services.add(String.format("%s:%s",list.get(i),serviceInstance.getUri()));
            }
        }
        return services;
    }

    @GetMapping("/hellos")
    public String hello() {
        return "hello world200100000000000";
    }

}
