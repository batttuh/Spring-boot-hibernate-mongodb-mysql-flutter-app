package com.example.springbootbackend.dto.request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private long id;
    private String userName;
    private String mail;

}
