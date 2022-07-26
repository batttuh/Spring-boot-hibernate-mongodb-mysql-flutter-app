package com.example.springbootbackend.controller;

import com.example.springbootbackend.entity.UserContext;
import com.example.springbootbackend.service.UserContextService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserContextController {
    private UserContextService userContextService;

    public UserContextController(UserContextService userContextService) {
        this.userContextService = userContextService;
    }
    //build create context REST API
    @PostMapping("usercontext")
    public ResponseEntity<UserContext> saveUserContext(@RequestBody UserContext userContext){
        return new ResponseEntity<UserContext>(userContextService.saveContext(userContext), HttpStatus.CREATED);
    }
    @GetMapping("usercontext")
    public List<UserContext> getAllUserContext(@RequestBody UserContext userContext){
        return userContextService.getAllUserContext();
    }
    @GetMapping("{id}")
    public ResponseEntity<UserContext> getUsercontextById(@PathVariable("id") long id){
        return new ResponseEntity<UserContext>(userContextService.getUserContextById(id), HttpStatus.OK);
    }

}
