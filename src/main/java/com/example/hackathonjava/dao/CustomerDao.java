package com.example.hackathonjava.dao;

import com.example.hackathonjava.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDao implements ICustomerDao{
    @Autowired
    private ICustomerRepository customerRepository;

    public CustomerDao(ICustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    public CustomerDao(){    //Constracter Overloading

    }

    @Override
    public void create(Customer customer) {

        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public String destroy(Long id) {

        customerRepository.deleteById(id);
        return "silindi";
    }

    @Override
    public List<Customer> getAllCustomer() {

        return customerRepository.findAll();

    }
}
