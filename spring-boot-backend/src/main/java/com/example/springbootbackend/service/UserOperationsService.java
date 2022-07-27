package com.example.springbootbackend.service;

import com.example.springbootbackend.dto.request.CreateUserOperationsRequest;
import com.example.springbootbackend.dto.UserOperationsDto;
import com.example.springbootbackend.dto.converter.UserOperationsDtoConverter;
import com.example.springbootbackend.entity.UserOperations;
import com.example.springbootbackend.repository.UserOperationsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserOperationsService {
    private final UserOperationsRepository userOperationsRepository;
    private final UserOperationsDtoConverter userOperationsDtoConverter;
    private final UserService userService;

    public UserOperationsService(UserOperationsRepository userOperationsRepository, UserOperationsDtoConverter userOperationsDtoConverter, UserService userService){
        this.userOperationsRepository=userOperationsRepository;
        this.userOperationsDtoConverter = userOperationsDtoConverter;
        this.userService = userService;
    }
    public UserOperationsDto createContext(CreateUserOperationsRequest createUserRequest){
        UserOperations userOperations=new UserOperations();
        userOperations.setContext(createUserRequest.getContext());
        userOperations.setMail(createUserRequest.getMail());
        userOperations.setImageUrl(createUserRequest.getImageUrl());
       return userOperationsDtoConverter.converter(userOperationsRepository.save(userOperations));
    }
    public List<UserOperationsDto> getAll(){
        List<UserOperationsDto> list = (userOperationsRepository.findAll().
                stream().map(userOperationsDtoConverter::converter).
                collect(Collectors.toList()));

        return list;
    }
    public List<UserOperationsDto> getUserContexts(CreateUserOperationsRequest createUserOperationsRequest){
       return userOperationsRepository.findByMail(createUserOperationsRequest.getMail()).stream().map(userOperationsDtoConverter::converter)
               .collect(Collectors.toList());
    }
}
