package com.example.springbootbackend.service;

import com.example.springbootbackend.entity.UserContext;

import java.util.List;

public interface UserContextService {
    UserContext saveContext(UserContext userContext);
    List<UserContext> getAllUserContext();
    UserContext getUserContextById(long id);
}
