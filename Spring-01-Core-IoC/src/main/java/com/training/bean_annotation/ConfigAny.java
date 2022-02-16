package com.training.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "This is okay too";
    }

    @Bean
    Integer numbers(){
        return 123;
    }
}
