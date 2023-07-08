package com.example.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value ="fake")
public class FakeCustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomerList() {
        return Arrays.asList(
                new Customer(1,"Kasun Lakmal"),
                new Customer(2,"Nisala Sudaraka")
        ) ;
    }
}
