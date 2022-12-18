package com.example.hackathonjava.service;

import com.example.hackathonjava.dao.CustomerDao;
import com.example.hackathonjava.dao.ICustomerRepository;
import com.example.hackathonjava.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    private CustomerDao customerDao;



    @Override
    public void create(Customer c) {
        customerDao.create(c);
    }

    @Override
    public void update(Customer c) {
        customerDao.update(c);
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
