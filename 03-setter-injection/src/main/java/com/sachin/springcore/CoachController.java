package com.sachin.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    //define a private filed for dependency
    private Coach myCoach;

    //define setter injection
   @Autowired
   public void setCoach(Coach theCoach){ //any method name is allowed
       myCoach = theCoach;
   }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
