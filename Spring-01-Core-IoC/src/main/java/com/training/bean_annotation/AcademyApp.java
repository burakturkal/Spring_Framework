package com.training.bean_annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AcademyApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
        //We define here what kind of configuration we will use
        //If we want to use Config annotation, we use this right one

        //container object here needs to go to Container class and show the beans

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        //getBean to access Bean data

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);

        ft.createAccount();
        pt.createAccount();

        PartTimeMentor pt2 = container.getBean("p2",PartTimeMentor.class);

        String str_out = container.getBean(String.class);
        System.out.println(str_out);


    }
}
