package com.hello.demo.controller;

import com.hello.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService service;

    @PostMapping("/HelloWorld")
    String hello_world(){
        return service.Hello_World();
    }
}

