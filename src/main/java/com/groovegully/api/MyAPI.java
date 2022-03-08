package com.groovegully.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class MyAPI {

    @GetMapping("/health")
    public String health(){
        return "fine";
    }

}
