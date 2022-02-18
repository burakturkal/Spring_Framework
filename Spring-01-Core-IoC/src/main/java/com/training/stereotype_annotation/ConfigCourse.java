package com.training.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // -> Because this class is the Config class
@ComponentScan // -> Go to this package package com.training.stereotype_annotation; and find the classes with @Component
//@ComponentScan(basePackages = "com.cydeo") -> says go and look at all the packages under com.cydeo
public class ConfigCourse {
}
