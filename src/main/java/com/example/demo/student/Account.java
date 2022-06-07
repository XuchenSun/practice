package com.example.demo.student;

import javax.persistence.*;

@Entity
@Table
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false,length=100)
    private String name;

}
