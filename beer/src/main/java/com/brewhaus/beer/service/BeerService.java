package com.brewhaus.beer.service;

import com.brewhaus.beer.entity.Beer;
import com.brewhaus.beer.repository.BeerRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BeerService {

    @Inject
    BeerRepository repository;

    public List<Beer> getAllBeer() {
        return repository.findAll();
    }

    public Beer getBeerById(int id) {
        return repository.getBeerById(id);
    }

    public void removeBeerById(int id) {
        repository.removeBeerById(id);
    }

    public void updateBeerById(Beer beer) {
        repository.save(beer);
    }

    public Beer addBeer(Beer beer) {
        return repository.save(beer);
    }
}
