package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Hello from Azure App Service (in the staging slot)!";
    }
    @GetMapping("/file")
    public String homes() {
        return "Greatest of all";
    }
}
