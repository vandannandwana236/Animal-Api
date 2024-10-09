package com.vandan.animals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @Autowired
    AnimalService service;

    @GetMapping("/animals")
    public List<AnimalModel> getAllAnimals(){
        return service.getAllAnimals();
    }
}
