package com.amd.project.service.serviceImpl;

import com.amd.project.model.Customer;
import com.amd.project.repository.CustomerRepository;
import com.amd.project.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public int create(Customer user) {
        return 0;
//        return this.customerRepository.createUser(user.getName(), user.getAge());
    }

    @Override
    public List<Customer> findAll() {
//        return this.customerRepository.findAllUser();
        return null;
    }
}
