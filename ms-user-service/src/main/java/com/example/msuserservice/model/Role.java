package com.example.msuserservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("roles")
public class Role {

    @Id
    private Long id;

    private String name;
    private String description;

    // Getters y Setters
}
