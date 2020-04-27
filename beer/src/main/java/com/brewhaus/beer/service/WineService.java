package com.brewhaus.beer.service;


import com.brewhaus.beer.entity.Beer;
import com.brewhaus.beer.entity.Wine;
import com.brewhaus.beer.repository.WineRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class WineService {

    @Inject
    WineRepository repo;

    public List<Wine> getAllWine(){ return repo.findAll();}
    public Wine getWineById(int id) {
        return repo.getWineById(id);
    }

    public void removeWineById(int id) {
        repo.removeWineById(id);
    }

    public void updateWineById(Wine wine) {
        repo.save(wine);
    }

    public Wine addWine(Wine wine) {
        return repo.save(wine);
    }

}
