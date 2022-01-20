package com.amd.project.controller;

import com.amd.project.model.Customer;
import com.amd.project.service.CustomerService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "user")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping()
    public int create(@RequestBody Customer user) {
        return this.customerService.create(user);
    }

    @GetMapping()
    public ApiResponse<List<Customer>> getAll() {
        List<Customer> userList = this.customerService.findAll();
        return new ApiResponse<>(200, SUCCESS, userList);
    }
}
