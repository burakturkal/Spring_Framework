package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {
    //Say Java also has Office Hours
    //So we want to wire officeHours object to Java object(bean)

    /*1ST WAY: FIELD INJECTION
        @Autowired
        OfficeHours officeHours;
     */

    //2ND WAY: CONSTRUCTOR INJECTION -> WE WILL USE THIS A LOT
    OfficeHours officeHours;

    @Autowired //You don't need to write this in new Spring.
    //So you can use @AllArgsConstructor of Lombok and that's it
    //Injection is done
    public Java(OfficeHours officeHours){
        this.officeHours = officeHours;
    }


    /* 3RD WAY: SETTER INJECTION
        Almost never used
     */


    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
