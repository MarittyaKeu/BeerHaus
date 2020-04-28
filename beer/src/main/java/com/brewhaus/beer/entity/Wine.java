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
    private Date time;

    public Wine(int id, String name, String wineType, String alcoholByVolume, Date time) {
        this.id = id;
        this.name = name;
        this.wineType = wineType;
        this.alcoholByVolume = alcoholByVolume;
        this.time = time;
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

    public String getWineType() {
        return wineType;
    }

    public void setWineType(String wineType) {
        this.wineType = wineType;
    }

    public String getAlcoholByVolume() {
        return alcoholByVolume;
    }

    public void setAlcoholByVolume(String alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
