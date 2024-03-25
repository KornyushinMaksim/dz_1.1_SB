package org.example.configurtions;

import lombok.Data;
import org.example.model.Cat;
import org.example.services.PetHouseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class PetHouseConfig {

    @Bean
    PetHouseService getPetHouseService() {
        return new PetHouseService();
    }

    @Bean
    Cat getCat() {
        return new Cat();
    }
}
