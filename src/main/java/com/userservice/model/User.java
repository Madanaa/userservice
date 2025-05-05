package com.userservice.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "user")
@Data
public class User {

    @Id
    private String userId;
    private String name;
    private String email;
    private String about;
}
