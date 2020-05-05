package com.example.hello.controller;

import com.example.hello.exception.InvalidUuidException;
import com.example.hello.model.Message;
import com.example.hello.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/getMessage")
    public Message getMessage() throws InvalidUuidException {
        return this.helloService.getMessage();
    }
}
