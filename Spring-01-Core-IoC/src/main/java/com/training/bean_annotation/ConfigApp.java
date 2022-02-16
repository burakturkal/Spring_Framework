package com.training.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Class name can be anything
//We can have multiple Configuration classes
@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){ // return type is FullTimeMentor
        return new FullTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

}
