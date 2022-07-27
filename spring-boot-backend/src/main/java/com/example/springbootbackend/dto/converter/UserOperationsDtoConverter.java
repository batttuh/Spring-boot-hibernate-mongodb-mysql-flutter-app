package com.example.springbootbackend.dto.converter;


import com.example.springbootbackend.dto.UserOperationsDto;
import com.example.springbootbackend.entity.UserOperations;
import org.springframework.stereotype.Component;

@Component
public class UserOperationsDtoConverter {
    public UserOperationsDto converter(UserOperations from){
        return new UserOperationsDto(from.getId(), from.getContext(),from.getImageUrl(), from.getMail());
    }
}
