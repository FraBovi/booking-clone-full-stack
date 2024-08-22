package com.booking.clone.be.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.booking.clone.be.dao.UserDAO;

public interface BookingRepository extends MongoRepository<UserDAO,String> {}
