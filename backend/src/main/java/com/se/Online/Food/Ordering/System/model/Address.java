package com.se.Online.Food.Ordering.System.model;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zip;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}