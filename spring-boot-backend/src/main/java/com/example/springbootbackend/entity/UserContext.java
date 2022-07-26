package com.example.springbootbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="usercontext")
public class UserContext {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="context")
    private String context;
    @Column(name="imageUrl")
    private String imageUrl;
}
