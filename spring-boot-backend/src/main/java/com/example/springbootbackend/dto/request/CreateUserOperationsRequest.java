package com.example.springbootbackend.dto.request;


import lombok.Data;

@Data
public class CreateUserOperationsRequest {
    private long id;
    private String context;
    private String imageUrl;
    private String mail;
}
