package com.example.hackathonjava.service;

import com.example.hackathonjava.entity.Address;

import java.util.List;

public interface IAddressService {
    void create(Address c);
    void update(Address c);
    Address getAddressById(Long id);
    String destroy(Long id);
    List<Address> getAllAddress();
}
