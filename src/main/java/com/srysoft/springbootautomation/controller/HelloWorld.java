package com.srysoft.springbootautomation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {

    @GetMapping("/welcome")
    public String sayHello(){
        return "Welcome to Spring Boot Application to learn Devops features";
    }
}
