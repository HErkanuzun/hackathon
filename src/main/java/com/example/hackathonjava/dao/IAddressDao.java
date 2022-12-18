package com.example.hackathonjava.dao;

import com.example.hackathonjava.entity.Address;
import com.example.hackathonjava.entity.Customer;

import java.util.List;

public interface IAddressDao {
    void create(Address address);
    void update(Address address);
    String destroy(Long id);

    Address getAddressById(Long id);

    List<Address> getAllAddress();
}
