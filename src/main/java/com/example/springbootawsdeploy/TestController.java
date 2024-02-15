package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "First message from AWS Ecs Test";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Second message from AWS Ecs Test";
    }
    
    @GetMapping("/msgadd")
    public String getMessage1() {
        return "Third message from AWS Ecs Test";
    }
}
