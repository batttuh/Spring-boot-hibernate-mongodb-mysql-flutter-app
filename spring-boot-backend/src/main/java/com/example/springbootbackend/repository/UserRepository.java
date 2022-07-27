package com.example.springbootbackend.repository;

import com.example.springbootbackend.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    public User findByMail(String mail);
    public boolean existsByMail(String mail);

    public void deleteByMail(String mail);

}
