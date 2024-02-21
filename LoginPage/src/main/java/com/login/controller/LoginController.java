package com.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class LoginController {


    @GetMapping("/")
    public String home() {
        return "Welcome to the home page!";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome User!";
    }

    @GetMapping("/manager")
    public String manager() {
        return "Welcome Manager!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin!";
    }
}
