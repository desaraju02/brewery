package com.nag.brewery.web.service;



import com.nag.brewery.web.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer getCustomer(int id) {
        System.out.println("Came till here ...");
        return Customer.builder().id(1).name("Shiv").build();
    }
}
