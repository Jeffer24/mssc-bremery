package com.example.msscbrewery.web.services;

import com.example.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Beer")
                .beerStyle("Ligth")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Save")
                .beerStyle("Beer")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
         BeerDto.builder().id(UUID.randomUUID())
                .beerName("Update")
                .beerStyle("Beer")
                .build();
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer.....");
    }
}
