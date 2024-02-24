package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Medicine painkiller() {
        return new Painkiller();
    }

    @Bean
    @Scope("singleton")
    public Medicine antibiotic() {
        return new Antibiotic();
    }

    @Bean
    public Courier courier() {
        return new CourierImpl();
    }
    public Adres adres(){
        return new Adres();
    }
}
