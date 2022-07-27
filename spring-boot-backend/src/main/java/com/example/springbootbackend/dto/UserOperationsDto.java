package com.example.springbootbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserOperationsDto {
    private long id;
    private String context;
    private String imageUrl;
    private String mail;
}
