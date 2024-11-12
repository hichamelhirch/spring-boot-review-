package com.example.demo;

import com.example.demo.repository.CustomerJDBCRepo;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

   @GetMapping("/count")
    public int cout(){
       return customerRepository.count();
   }

}
