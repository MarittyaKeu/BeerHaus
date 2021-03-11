package com.brewhaus.beer.controller;


import com.brewhaus.beer.entity.Beer;
import com.brewhaus.beer.service.BeerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import java.io.File;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/beers")
@Transactional
public class BeerController {

    private static Logger logger = LoggerFactory.getLogger(BeerController.class);

    @Inject
    BeerService beerService;

    //test
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable int id) {
        return beerService.getBeerById(id);
    }

    @RequestMapping(path = "/getAllBeers", method = RequestMethod.GET)
    public List<Beer> getAllBeer() {
        return beerService.getAllBeer();
    }

    @RequestMapping(path = "/remove/{id}", method = RequestMethod.DELETE)
    public void removeBeer(@PathVariable int id) {
        beerService.removeBeerById(id);
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.PUT)
    public void updateBeer(@RequestBody Beer beer, @PathVariable int id) {
        Beer newBeer = beerService.getBeerById(id);

        if (newBeer == null) {
            logger.error("Beer not found");
        }
        else {
            newBeer.setId(beer.getId());
            newBeer.setName(beer.getName());
            newBeer.setAlcoholByVolume(beer.getAlcoholByVolume());
            newBeer.setBeerType(beer.getBeerType());
        }

        beerService.updateBeerById(newBeer);
    }

    @RequestMapping(path = "/addBeer", method = RequestMethod.POST)
    public Beer addBeer(@RequestBody Beer beer) {
        System.out.print("add beer");
        return beerService.addBeer(beer);
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity fileUpload(@RequestParam("file") MultipartFile file){
        try{
            System.out.printf("file name is %s, size=%s\n", file.getOriginalFilename(), file.getSize());
            //creating a new file in some local directory
            File fileToSave = new File("C:\\test\\" + file.getOriginalFilename());
            //copy file content from received file to new local file
            file.transferTo(fileToSave);


        }catch(IOException ioe){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return ResponseEntity.ok().build();

    }


}
