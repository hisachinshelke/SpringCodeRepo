package com.sachin.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //for prototype scope
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice batting daily!!";
    }
}
