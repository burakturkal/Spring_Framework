package com.training.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AcademyApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);
        context.getBean(Java.class)  //-> This says give me a bean of Java.class
                .getTeachingHours(); //-> This says get this method of the bean you made

    }
}
