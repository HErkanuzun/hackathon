package com.example.hackathonjava.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;



@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "password",  nullable = false)
    private String password;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<Address> addressList;


    public Customer(Long id, String mail, Set<Address> addressList, String password){
        this.id = id;
        this.mail = mail;
        this.password= password;
        this.addressList = addressList;
    }

    public Customer() {

    }


}
