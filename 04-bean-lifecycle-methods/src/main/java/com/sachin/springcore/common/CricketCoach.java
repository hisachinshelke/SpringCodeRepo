package com.sachin.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice batting daily!!";
    }

    //define our init method
    @PostConstruct
        public void doMyStartUpStuff(){
        System.out.println("In doMyStartUpStuff method of cricket coach class!!: " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyStartUpStuff method of cricket coach class!!: " + getClass().getSimpleName());
    }
}
