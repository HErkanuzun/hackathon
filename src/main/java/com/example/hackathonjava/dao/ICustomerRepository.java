package com.example.hackathonjava.dao;


import com.example.hackathonjava.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByEmail(String email);

}
