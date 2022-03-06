package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home") //Use @RequestMapping annotation to associate the action with an HTTP request path
    public String home(){ //method name doesn't matter

        return "home.html"; //Return the HTML document name that contains the details we want the browser to display
    }


    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }

    @RequestMapping
    public String home3(){
        return "welcome.html";
    }


}
