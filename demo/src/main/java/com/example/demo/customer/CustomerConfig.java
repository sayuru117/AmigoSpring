package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Value("${app.fakeCustomerRepo:false}")
    Boolean fakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("HEllo spring");
        };

    }
    @Bean
    CustomerRepo customerRepo(){
        System.out.println("useFakeCustomerRepo = "+ fakeCustomerRepo);
        return fakeCustomerRepo ? new FakeCustomerRepository():new CustomerRepository();

    }
}
