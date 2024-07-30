package com.booking.clone.be.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.clone.be.dto.RegistrationDTO;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class RegistrationController {

    @GetMapping("/test")
    public String getTest() {
        return new String("test ok");
    }

    @PostMapping("/register")
    public String registration(@RequestBody RegistrationDTO registratioInfo) {
        return new String("test ok");
    }
    
    
}
