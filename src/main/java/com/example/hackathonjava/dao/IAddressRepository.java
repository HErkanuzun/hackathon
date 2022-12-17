package com.example.hackathonjava.dao;


import com.example.hackathonjava.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address,Long> {
}
