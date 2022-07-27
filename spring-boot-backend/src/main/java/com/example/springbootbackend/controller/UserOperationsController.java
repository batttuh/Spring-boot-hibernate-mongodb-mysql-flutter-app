package com.example.springbootbackend.controller;

import com.example.springbootbackend.dto.request.CreateUserOperationsRequest;
import com.example.springbootbackend.dto.UserOperationsDto;
import com.example.springbootbackend.service.UserOperationsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userOperationsController")
public class UserOperationsController {
    private final UserOperationsService userOperationsService;

    public UserOperationsController(UserOperationsService userOperationsService) {
        this.userOperationsService = userOperationsService;
    }
    //build create context REST API



    @PostMapping("createContext")
    public ResponseEntity<UserOperationsDto> createContext(@RequestBody CreateUserOperationsRequest createUserRequest){
        return new ResponseEntity<UserOperationsDto>(
                userOperationsService.createContext(createUserRequest),HttpStatus.CREATED);
    }
    @GetMapping("getAll")
    public List<UserOperationsDto> getAllContext(){
        return userOperationsService.getAll();
    }

    @GetMapping("getUserContexts")
    public List<UserOperationsDto> getUserContexts(@RequestBody CreateUserOperationsRequest createUserOperationsRequest){
        return userOperationsService.getUserContexts(createUserOperationsRequest);
    }
}
