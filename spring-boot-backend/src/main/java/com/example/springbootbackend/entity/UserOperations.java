package com.example.springbootbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="useroperations")
public class UserOperations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="context")
    private String context;
    @Column(name="imageUrl")
    private String imageUrl;
    @Column(name="mail")
    private String mail;

}
