package com.ramos.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestAuthController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Wolrd";
    }

    @GetMapping("hello-secured")
    public String helloSecured(){
        return "Hello World Secured";
    }
}
