package com.example.hackathonjava.dao;

import com.example.hackathonjava.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDao implements IAddressDao {

    @Autowired
    public AddressDao(IAddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    private IAddressRepository addressRepository;

    public AddressDao(){

    }

    @Override
    public void create(Address a) {

        addressRepository.save(a);
    }

    @Override
    public void update(Address a) {
        addressRepository.save(a);
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public String destroy(Long id) {

        addressRepository.deleteById(id);
        return "Address silindi";
    }

    @Override
    public List<Address> getAllAddress() {

        return addressRepository.findAll();

    }
}