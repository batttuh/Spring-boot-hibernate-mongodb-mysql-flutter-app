package com.example.springbootbackend.repository;

import com.example.springbootbackend.document.User;
import com.example.springbootbackend.entity.UserOperations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserOperationsRepository extends JpaRepository<UserOperations,Long> {
    public List<UserOperations> findByMail(String mail);

}
