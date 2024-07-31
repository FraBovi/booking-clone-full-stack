package com.booking.clone.be.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class BookingRepository {

    private EntityManager entityManager;

    @Autowired
    public BookingRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    } 
    
}
