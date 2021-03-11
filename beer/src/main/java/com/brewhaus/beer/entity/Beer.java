package com.brewhaus.beer.entity;


import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Transactional
public class Beer {
    @Id
    private int id;
    private String name;
    private String beerType;
    private float alcoholByVolume;
    private String picture;
    private Date time;
    private String description;


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

    public void setAlcoholByVolume(float alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
    }

    public String getPicture(){
        return this.picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }

    public Date getTime(){
        return this.time;
    }

    public void setTime(Date time){
        this.time = time;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
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



}
