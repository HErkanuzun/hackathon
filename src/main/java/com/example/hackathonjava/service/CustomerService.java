package com.example.hackathonjava.service;

import com.example.hackathonjava.dao.CustomerDao;
import com.example.hackathonjava.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService{


    @Autowired
    private CustomerDao customerDao;

    @Override
    public void create(Customer customer) {
        customerDao.create(customer);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public String destroy(Long id) {
        customerDao.destroy(id);
        return "Silindi";
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }
}
