package com.ishmum.practice.hrm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class WelcomeController {

    @GetMapping(value = "")
    public String welcomeVisitor() {
        return "Hello World!";
    }

}
