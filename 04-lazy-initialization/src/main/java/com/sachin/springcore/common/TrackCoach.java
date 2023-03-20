package com.sachin.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Track activities!!";
    }
}
