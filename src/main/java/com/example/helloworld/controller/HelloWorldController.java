package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/bol")
    public String sendGreetings() {

        
        return "Hello, Boller! I am the intern!";
    }
}
