package com.booking.clone.be.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class UserDAO {

    @Column
    private String name;
    
    @Id
    @Column
    private String email;
    
    @Column
    private String password;
    
}
