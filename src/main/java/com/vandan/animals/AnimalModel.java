package com.vandan.animals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="animals")
public class AnimalModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image_name;
    private String image_url;
    public AnimalModel() {
    }

    

    public AnimalModel(int id, String image_name, String image_url) {
        this.id = id;
        this.image_name = image_name;
        this.image_url = image_url;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getImage_name() {
        return image_name;
    }
    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }
    public String getImage_url() {
        return image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    

}
