package com.example.hackathonjava.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;


@Data
@ToString
@JsonIgnoreProperties
@JsonInclude
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(unique = true, name = "mail", nullable = false)
    private String mail;

    @Column(name = "password",  nullable = false)
    private String password;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<Address> addressList;


    public Customer(Long id, String mail, String password,Set<Address> addressList){
        this.id = id;
        this.mail = mail;
        this.password= password;
        this.addressList = addressList;
    }

    public Customer() {

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(Set<Address> addressList) {
        this.addressList = addressList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
