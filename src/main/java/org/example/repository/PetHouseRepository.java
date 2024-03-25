package org.example.repository;

import org.example.model.Animal;

import java.util.List;

public interface PetHouseRepository {
    void createAnimal(String name, int age, String breed);
    List<Animal> viewAnimals();
    void updateAnimal(String name, int age, String breed, int index);
    void deleteAnimal(String name);
}
