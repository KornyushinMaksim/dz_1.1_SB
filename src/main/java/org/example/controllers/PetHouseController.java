package org.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class PetController {
    @Autowired
    private PetController petController;

    public void createAnimal(String name, int age, String breed) {
        petController.createAnimal(name, age, breed);
    }
}
