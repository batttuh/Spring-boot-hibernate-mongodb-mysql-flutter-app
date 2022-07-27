package com.example.springbootbackend.controller;

import com.example.springbootbackend.dto.request.CreateUserRequest;
import com.example.springbootbackend.dto.UserDto;
import com.example.springbootbackend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("createUser")
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserRequest createUserRequest){
        return new ResponseEntity<UserDto>(userService.createUser(createUserRequest),HttpStatus.CREATED);
    }
    /*
    @GetMapping("getUser")
    public ResponseEntity<UserDto> getUser(){
        return new ResponseEntity<UserDto>(userService.createUser(createUserRequest),HttpStatus.CREATED);
    }

     */
}
