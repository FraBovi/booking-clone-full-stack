package com.booking.clone.be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.clone.be.dao.UserDAO;
import com.booking.clone.be.dto.User;
import com.booking.clone.be.repository.BookingRepository;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class RegistrationController {

    private BookingRepository bookingRepo;

    @Autowired
    public RegistrationController(BookingRepository bookingRepository) {
        this.bookingRepo = bookingRepository;
    }

    @GetMapping("/test")
    public String getTest() {
        return new String("test ok");
    }

    @PostMapping("/register")
    public UserDAO registration(@RequestBody User registratioInfo) {
        return bookingRepo.save(new UserDAO(null, registratioInfo.getName(), registratioInfo.getEmail(), registratioInfo.getPassword()));
    }
    
    
}
