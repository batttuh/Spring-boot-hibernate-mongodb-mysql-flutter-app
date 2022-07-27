package com.example.springbootbackend.service;


import com.example.springbootbackend.document.User;
import com.example.springbootbackend.dto.request.CreateUserRequest;
import com.example.springbootbackend.dto.UserDto;
import com.example.springbootbackend.dto.converter.UserDtoConverter;
import com.example.springbootbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;

    public UserService(UserRepository userRepository, UserDtoConverter userDtoConverter){
        this.userRepository=userRepository;
        this.userDtoConverter = userDtoConverter;
    }
    public UserDto createUser(CreateUserRequest createUserRequest){

        if(userRepository.existsByMail(createUserRequest.getMail())){

            return null;
        }else{

            User user=new User();
            user.setUserName(createUserRequest.getUserName());
            user.setMail(createUserRequest.getMail());
            return userDtoConverter.convert(userRepository.save(user));
        }



    }
    protected UserDto findUserByMail(String mail)
    {
        return userDtoConverter.convert(userRepository.findByMail(mail));

    }


}
