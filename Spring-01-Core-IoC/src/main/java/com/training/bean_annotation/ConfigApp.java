package com.training.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Class name can be anything
//We can have multiple Configuration classes
@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){ // return type is FullTimeMentor
        return new FullTimeMentor();
    }

    //BELOW TO EXPLAIN NAMES
    /*
    We give names to be able to call one certain bean
     */
    @Bean(name = "p1")
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean(name = "p2")
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }

    // BELOW TO EXPLAIN @PRIMARY
    @Bean
    @Primary //when you say to make a new parttimementor, this will be made because
             // it is primary
    PartTimeMentor partTimeMentor3(){
        return new PartTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor4(){
        return new PartTimeMentor();
    }

}
