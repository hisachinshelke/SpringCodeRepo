package com.sachin.learning.springbootlearn.MyRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPage {

    @GetMapping("/")
    public String LandingMessage(){
        return "Hello World!! from Sachin";
    }

    @GetMapping("/workout")
    public String getDailyWorkOut(){
        return "Run 2Km daily";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is awesome day!!";
    }
}
