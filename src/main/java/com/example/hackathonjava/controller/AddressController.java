package com.example.hackathonjava.controller;
import org.springframework.context.annotation.Bean;
import com.example.hackathonjava.entity.Address;
import com.example.hackathonjava.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    public AddressController(IAddressService addressService) {
        this.addressService = addressService;
    }


    private final IAddressService addressService;


    @GetMapping("/all")
    public List<Address> getAll(){
        return addressService.getAllAddress();
    }

    @PostMapping("/{id}")
    public String deleteAddressById(@PathVariable Long id){

        return addressService.destroy(id);
    }
    @PostMapping("/update")
    public ResponseEntity<String> updateAddress(@RequestBody Address a){
        addressService.update(a);
        return ResponseEntity.ok("Guncellendi");
    }
    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createAddress(@RequestBody Address a){
        addressService.create(a);
        return ResponseEntity.ok("BAŞARIYLA OLUSTURULDU");
    }

}
