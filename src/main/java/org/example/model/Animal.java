package org.example.model;

import lombok.Data;
import org.example.interf.iSound;

@Data
public abstract class Animal implements iSound {
    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Animal() {
    }
}
