package com.sachin.learning.springbootlearn.MyRestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

   //inject properties for coach and team name from application.properties files
    @Value("${coach.name}") //inject properties from application.properties file
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose endpoint for team information
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach name is : " + coachName + " and team name is : " + teamName;
    }

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
