package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseAwsDeploy {

    @GetMapping("/home")
    public String disk() {
        return "Welcome to CSE Jenkins";
    }

    @GetMapping("/home1")
    public String disk2() {
        return "Welcome to CSE";
    }
}