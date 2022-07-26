package com.example.springbootbackend.service.impl;

import com.example.springbootbackend.entity.UserContext;
import com.example.springbootbackend.exception.ResourceNotFoundException;
import com.example.springbootbackend.repository.UserContextRepository;
import com.example.springbootbackend.service.UserContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserContextImpl implements UserContextService {

    private UserContextRepository userContextRepository;

    public UserContextImpl(UserContextRepository userContextRepository) {
        this.userContextRepository = userContextRepository;
    }

    @Override
    public UserContext saveContext(UserContext userContext) {
        return userContextRepository.save(userContext);
    }

    @Override
    public List<UserContext> getAllUserContext() {
        return userContextRepository.findAll();
    }

    @Override
    public UserContext getUserContextById(long id) {
       return userContextRepository.findById(id).orElseThrow(()->
               new ResourceNotFoundException("UserContext","Id",id));
    }

}
