package com.example.springbootbackend.dto.converter;

import com.example.springbootbackend.document.User;
import com.example.springbootbackend.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {
    public UserDto convert(User from){
        return new UserDto(from.getUserName(),from.getMail());
    }
}
