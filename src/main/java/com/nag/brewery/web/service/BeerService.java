package com.nag.brewery.web.service;

import com.nag.brewery.web.model.BeerDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

    BeerDTO createBeer(BeerDTO beerDTO);
}

