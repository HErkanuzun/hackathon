package com.example.hackathonjava.entity;


import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import javax.persistence.*;


@Entity
@Table(name = "address")
public class Address {
    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "city",nullable = true)
    private String city;

    @Column(name = "district", nullable = true)
    private String district;

    @Column(name = "description",nullable = true)
    private String  description;


    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public Address(Long id, String name, String city, String district, String description, Customer customer){
        this.id = id;
        this.name = name;
        this.city = city;
        this.district = district;
        this.description = description;
        this.customer = customer;

    }

    public Address(){

    }

}
