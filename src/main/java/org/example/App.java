package org.example;

import org.example.configurtions.PetHouseConfig;
import org.example.repository.PetHouseRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.example"})
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PetHouseConfig.class);
        PetHouseRepository ph = context.getBean(PetHouseRepository.class);
        ph.createAnimal("barsik", 5, "pers");
        ph.createAnimal("pushok", 5, "1");
        ph.createAnimal("barsik", 5, "2");
        System.out.println(ph.viewAnimals());
    }
}
