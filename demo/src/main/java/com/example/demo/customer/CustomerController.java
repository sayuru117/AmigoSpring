package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private  CustomerService customerService ;

//    @Autowired
//    public CustomerController(CustomerService customerService){
//       this.customerService = customerService;
//    }
    @Autowired
    public void setCustomerService(CustomerService customerService){
        this.customerService = customerService;
    }


    @GetMapping
    Customer getCustomer(){
       return customerService.getCustomer();
    }
}
