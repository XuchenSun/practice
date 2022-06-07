package com.example.demo.student;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false,length=100)
    private String name;

    @Column(nullable=false,length=100)
    private String city;

    @Column(nullable=false,length=100)
    private String email;

    @Column(nullable=false,length=100)
    private int phone_number;
}
