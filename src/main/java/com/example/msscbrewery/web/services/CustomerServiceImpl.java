package com.example.msscbrewery.web.services;

import com.example.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {

            return CustomerDto.builder().id(UUID.randomUUID())
                    .name("Cliente 1")
                    .build();

    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Cliente 1 Save")
                .build();
    }

    @Override
    public void updateBeer(UUID customerId, CustomerDto customerDto) {
        CustomerDto.builder().id(UUID.randomUUID())
                .name("Cliente 1 Update")
                .build();
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer.....");
    }
}
