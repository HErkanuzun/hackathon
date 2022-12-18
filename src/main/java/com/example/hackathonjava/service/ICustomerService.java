package com.example.hackathonjava.service;

import com.example.hackathonjava.entity.Customer;

import java.util.List;

public interface ICustomerService {
    void create(Customer c);
    void update(Customer c);
    Customer getCustomerById(Long id);
    String destroy(Long id);
    List<Customer> getAllCustomer();
}
