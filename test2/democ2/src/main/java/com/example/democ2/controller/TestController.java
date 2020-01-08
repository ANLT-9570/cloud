package com.example.democ2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("esr")
    public List<String> test(){
        return restTemplate.getForEntity("http://Server-Provider1/info",List.class).getBody();
    }

    @GetMapping("helloss")
    public String test2(){
        return restTemplate.getForEntity("http://Server-Provider1/hellos",String.class).getBody();
    }

    @GetMapping("ttes")
    public String test3(){
        return restTemplate.getForEntity("http://Server-Provider1/hellos",String.class).getBody();
    }
}
