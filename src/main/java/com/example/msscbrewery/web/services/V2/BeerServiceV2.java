package com.example.msscbrewery.web.services.V2;

import com.example.msscbrewery.web.model.BeerDto;
import com.example.msscbrewery.web.model.V2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
