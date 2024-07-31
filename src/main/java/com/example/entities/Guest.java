package com.example.entities;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;
 

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "guests")
@Serdeable
public class Guest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "registeredguest")
    private boolean registeredguest;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
    
    @Column(name = "address")
    private String address;


    
}
