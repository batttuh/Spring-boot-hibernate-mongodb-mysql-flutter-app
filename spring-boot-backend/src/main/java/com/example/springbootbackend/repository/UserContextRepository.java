package com.example.springbootbackend.repository;

import com.example.springbootbackend.entity.UserContext;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserContextRepository extends JpaRepository<UserContext,Long> {

}
