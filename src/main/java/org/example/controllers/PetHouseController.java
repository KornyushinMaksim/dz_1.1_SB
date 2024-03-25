package org.example.controllers;

import org.example.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Component("phc")
public class PetHouseController {
    @Autowired
    private PetHouseController petHouseController;

    public void createAnimal(String name, int age, String breed) {
        petHouseController.createAnimal(name, age, breed);
    }

    public List<Animal> viewAnimals() {
        return petHouseController.viewAnimals();
    }
}
