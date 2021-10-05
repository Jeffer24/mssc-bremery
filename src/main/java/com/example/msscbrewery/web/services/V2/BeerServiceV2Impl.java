package com.example.msscbrewery.web.services.V2;

import com.example.msscbrewery.web.model.BeerDto;
import com.example.msscbrewery.web.model.V2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2{
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Beer")
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Save")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Update")
                .build();
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer V2.....");
    }
}
