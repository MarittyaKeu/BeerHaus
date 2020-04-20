package com.brewhaus.beer.repository;

import com.brewhaus.beer.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {

    public Beer getBeerById(int id);
    public void removeBeerById(int id);
}
