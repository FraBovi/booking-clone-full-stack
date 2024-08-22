package com.booking.clone.be.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Document(collection = "users")
public class UserDAO {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    
}
