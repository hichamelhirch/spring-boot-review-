package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CustomerJDBCRepo implements CustomerRepository {

   private JdbcTemplate jdbcTemplate;

    public CustomerJDBCRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int count() {

        return jdbcTemplate.queryForObject("", Integer.class);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
