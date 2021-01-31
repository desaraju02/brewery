package com.nag.brewery.web.service;

import com.nag.brewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().uuid(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
    }

    @Override
    public BeerDTO createBeer(BeerDTO beerDTO) {
        return BeerDTO.builder().uuid(UUID.randomUUID()).build();
    }
}
