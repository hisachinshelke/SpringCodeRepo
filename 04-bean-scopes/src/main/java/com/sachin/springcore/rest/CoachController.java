package com.sachin.springcore.rest;

import com.sachin.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    //define a private filed for dependency
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public CoachController(@Qualifier("cricketCoach") Coach theCoach,
                           @Qualifier("cricketCoach") Coach theAnotherCoach){ //@Qualifier has higher priority than @Primary qualifier
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;


    }

   /* @Autowired
    public CoachController(@Qualifier("tennisCoach") Coach theCoach){ //added qualifier annotation
        myCoach = theCoach;
    }*/

    /*//define setter injection
   @Autowired
   public void setCoach(@Qualifier("tennisCoach") Coach theCoach){ //works in setter type injection also
       myCoach = theCoach;
   }*/

    @GetMapping("/check")
    public String checkScope(){
        return "Comparing beans : myCoach == anotherCoach : " + (myCoach == anotherCoach);  //true for singleton
    }  // false if set @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
