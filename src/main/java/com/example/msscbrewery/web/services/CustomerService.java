package com.example.msscbrewery.web.services;

import com.example.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto save(CustomerDto customerDto);

    void updateBeer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
