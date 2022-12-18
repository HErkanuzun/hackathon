package com.example.hackathonjava.service;


import com.example.hackathonjava.dao.AddressDao;
import com.example.hackathonjava.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService implements IAddressService{

    @Autowired
    public AddressService(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    private AddressDao addressDao;

    @Override
    public void create(Address a) {
        addressDao.create(a);
    }

    @Override
    public void update(Address a) {
        addressDao.update(a);
    }

    @Override
    public Address getAddressById(Long id) {
        return addressDao.getAddressById(id);
    }

    @Override
    public String destroy(Long id) {
        addressDao.destroy(id);
        return "Silindi";
    }

    @Override
    public List<Address> getAllAddress() {
        return addressDao.getAllAddress();
    }
}
