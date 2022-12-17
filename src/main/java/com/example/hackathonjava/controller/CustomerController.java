package com.example.hackathonjava.controller;

import com.example.hackathonjava.entity.Customer;
import com.example.hackathonjava.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;


    @GetMapping("/all")
    public List<Customer> getAll() {
        return customerService.getAllCustomer();
    }

    @PostMapping("/{id}")
    public String deleteCustomerById(@PathVariable Long id) {
        return customerService.destroy(id);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
        customerService.update(customer);
        return ResponseEntity.ok("Guncellendi");
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        customerService.create(customer);
        return ResponseEntity.ok("BAŞARIYLA OLUSTURULDU");
    }

}