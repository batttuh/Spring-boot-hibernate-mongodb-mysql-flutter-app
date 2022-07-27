package com.example.springbootbackend.document;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.persistence.*;

@Data
@EnableMongoRepositories
@Document("User")
public class User {

    @Column(name="userName")
    private String userName;
    @Column(name="mail")
    private String mail;
}
