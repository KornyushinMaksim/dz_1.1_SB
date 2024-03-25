package org.example.services;

import org.example.model.Animal;
import org.example.model.Cat;
import org.example.model.PetHouse;
import org.example.repository.PetHouseRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("phc")
public class PetHouseService extends PetHouse implements PetHouseRepository {

    @Override
    public void createAnimal(String name, int age, String breed) {
        Animal tmpAnimal = new Animal(name, age, breed) {
            @Override
            public String sound() {
                return null;
            }
        };
        this.getAnimals().add(tmpAnimal);
    }

    @Override
    public List<Animal> viewAnimals() {
        return this.getAnimals();
    }

    @Override
    public void updateAnimal(String name, int age, String breed, int index) {
        Animal tmpAnimal = new Cat(name, age, breed);
        this.getAnimals().set(index, tmpAnimal);
    }

    @Override
    public void deleteAnimal(String name) {

    }
}
