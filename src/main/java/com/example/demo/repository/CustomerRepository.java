package com.example.demo.repository;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerRepository {

    int count();
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
    void deleteCustomer(Long id);
}
