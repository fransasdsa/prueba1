package com.example.msuserservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public class User {

    @Id
    private Long id;

    private String username;
    private String password;
    private String email;
    private boolean enabled;

    // Getters y Setters
}
