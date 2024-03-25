package org.example.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Data
public class PetHouse {
    private String name;
    private List<Animal> animals;

    @Autowired
    private Animal cat;

    public PetHouse(String name, List<Animal> animals, Animal cat) {
        this.name = name;
        this.animals = animals;
        this.cat = cat;
    }

    public PetHouse() {
        this.animals = new ArrayList<>();
    }
}
