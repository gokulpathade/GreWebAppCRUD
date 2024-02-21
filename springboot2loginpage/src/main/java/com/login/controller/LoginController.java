package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.User;
import com.login.service.UserService;

@RestController
//@RequestMapping("/")
public class LoginController {

	
	
	 @Autowired
     UserService userService;    
	 
    @GetMapping("/")
    public String home() {
        return "Welcome to the home page  2222222 spring ksecurity          !";
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
        return "We lcome Admin!";
    }
    
    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User U) {
         userService.saveUser(U);
    }
    
}
