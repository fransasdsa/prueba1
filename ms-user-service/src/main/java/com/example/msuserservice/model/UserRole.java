package com.example.msuserservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("user_roles")
public class UserRole {

    @Id
    private Long id;

    private Long userId;
    private Long roleId;

    // Getters y Setters
}
