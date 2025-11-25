package com.acuver.springbootkickoff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllor {

    @GetMapping("/hello")
    public String hello(){
        return "hello Acuver";
    }
}
