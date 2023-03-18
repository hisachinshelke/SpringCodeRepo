package com.sachin.learning.springbootlearn.MyRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPage {

    @GetMapping("/")
    public String LandingMessage(){
        return "Hello World!!";
    }
}
