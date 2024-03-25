package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public String sound() {
        return "мяяяуу...";
    }
}
