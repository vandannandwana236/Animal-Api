package com.vandan.animals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {
    
    @Autowired
    AnimalRepository repo;

    public List<AnimalModel> getAllAnimals(){
        return repo.findAll();
    }
}
