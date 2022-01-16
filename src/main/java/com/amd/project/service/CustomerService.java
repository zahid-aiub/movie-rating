package com.amd.project.service;

import com.amd.project.model.Customer;

import java.util.List;

public interface CustomerService {
    int create(Customer user);

    List<Customer> findAll();
}
