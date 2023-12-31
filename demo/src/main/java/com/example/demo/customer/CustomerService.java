package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(
            @Qualifier("fake") CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    List<Customer> getCustomerList(){
        return customerRepo.getCustomerList();
    }
}
