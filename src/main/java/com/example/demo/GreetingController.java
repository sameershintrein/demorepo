package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;


    @RestController
    @RequestMapping("/api")
    public class GreetingController {
        @GetMapping("/greeting")
        public Map<String, String> getGreeting() {
            return Map.of("message", "Hello from Demo Spring Boot!");
        }
    }
