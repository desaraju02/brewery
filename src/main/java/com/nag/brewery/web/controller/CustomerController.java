package com.nag.brewery.web.controller;

import com.nag.brewery.web.model.Customer;
import com.nag.brewery.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    public CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id){
        System.out.println("In controller ...");
        return new ResponseEntity<>(customerService.getCustomer(id), HttpStatus.OK);
    }
}
