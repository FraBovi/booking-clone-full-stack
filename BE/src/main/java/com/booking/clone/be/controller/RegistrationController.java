package com.booking.clone.be.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class RegistrationController {

    @GetMapping("/test")
    public String getTest() {
        return new String("test ok");
    }
    
    
}
