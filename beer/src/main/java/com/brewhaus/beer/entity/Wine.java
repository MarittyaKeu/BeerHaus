package com.brewhaus.beer.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.Date;

@Entity
@Transactional
public class Wine {
    @Id
    private int id;
    private String name;
    private String wineType;
    private String alcoholByVolume;
    private String picture;
    private Date time;
    private String description;

    public Wine(int id, String name, String wineType, String alcoholByVolume, String picture, String description, Date time) {
        this.id = id;
        this.name = name;
        this.wineType = wineType;
        this.alcoholByVolume = alcoholByVolume;
        this.picture = picture;
        this.time = time;
        this.description = description;
    }

    public Wine(){} //must have this empty default constructor

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getWineType() {
        return this.wineType;
    }
    public String getAlcoholByVolume() {
        return this.alcoholByVolume;
    }
    public String getPicture(){return this.picture;}
    public Date getTime(){return this.time;}
    public String getDescription(){return this.description;}


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWineType(String wineType) {
        this.wineType = wineType;
    }
    public void setAlcoholByVolume(String alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
    }
    public void setPicture(String picture){this.picture = picture;}
    public void setTime(Date time){this.time = time;}
    public void setDescription(String description){this.description = description;}

}
