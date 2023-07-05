package com.example.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CustomerService {


    Customer getCustomer(){
        return new Customer(1,"Sayuru Dissanayaka");
    }
}
