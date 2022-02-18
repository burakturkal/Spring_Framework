package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

/* NO WIRING
    @Bean
    Person person() {
        Person p = new Person();
        p.setName("Mike");
        return p;
    }

 */

/* DIRECT WIRING
    @Bean
    Person person() {
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car()); //-> Wiring (Direct Wiring)
        return p;
    }
 */

    //AUTO WIRING
    @Bean
    Person person(Car car) {
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car); //-> Autowiring
        return p;
    }
}
