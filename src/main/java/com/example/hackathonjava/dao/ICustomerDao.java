package com.example.hackathonjava.dao;

import com.example.hackathonjava.entity.Customer;

import java.util.List;

public interface ICustomerDao {
    void create(Customer customer);
    void update(Customer customer);
    String destroy(Long id);

    Customer getCustomerById(Long id);

    List<Customer>getAllCustomer();
}
