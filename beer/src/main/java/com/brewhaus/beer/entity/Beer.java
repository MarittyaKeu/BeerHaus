package com.brewhaus.beer.entity;


import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Transactional
public class Beer {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String beerType;
    private float alcoholByVolume;

    public Beer(int id, String name, String beerType, float alcoholByVolume){
        this.id = id;
        this.name = name;
        this.beerType = beerType;
        this.alcoholByVolume = alcoholByVolume;
    }

    public Beer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    public float getAlcoholByVolume() {
        return alcoholByVolume;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", beerType='" + beerType + '\'' +
                ", alcoholByVolume=" + alcoholByVolume +
                '}';
    }

    public void setAlcoholByVolume(float alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
    }


}
