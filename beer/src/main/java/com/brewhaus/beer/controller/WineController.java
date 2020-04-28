package com.brewhaus.beer.controller;


import com.brewhaus.beer.entity.Beer;
import com.brewhaus.beer.entity.Wine;
import com.brewhaus.beer.service.BeerService;
import com.brewhaus.beer.service.WineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/wines")
@Transactional
public class WineController {

    private static Logger logger = LoggerFactory.getLogger(WineController.class);

    @Inject
    WineService wineService;

    //test
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Wine getWineById(@PathVariable int id) {
        return wineService.getWineById(id);
    }

    @RequestMapping(path = "/getAllWines", method = RequestMethod.GET)
    public List<Wine> getAllWine() {
        return wineService.getAllWine();
    }

    @RequestMapping(path = "/remove/{id}", method = RequestMethod.DELETE)
    public void removeBWine(@PathVariable int id) {
        wineService.removeWineById(id);
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.PUT)
    public void updateWine(@RequestBody Wine wine, @PathVariable int id) {
        Wine newWine = wineService.getWineById(id);
        if (newWine == null) {
            logger.error("Wine not found");
        }
        else {
            newWine.setId(wine.getId());
            newWine.setName(wine.getName());
            newWine.setAlcoholByVolume(wine.getAlcoholByVolume());
            newWine.setWineType(wine.getWineType());
        }

        wineService.updateWineById(newWine);
    }


    @RequestMapping(path = "/addWine", method = RequestMethod.POST)
    public Wine addWine(@RequestBody Wine wine) {
        return wineService.addWine(wine);
    }

}
