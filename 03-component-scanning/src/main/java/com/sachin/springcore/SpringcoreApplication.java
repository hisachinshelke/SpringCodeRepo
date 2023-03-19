package com.sachin.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( //enables autowiring, etc
		scanBasePackages = {"com.sachin.util,com.sachin.springcore"}  //explicitly tell which packages to scan
)

public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args); //bootstraping application
	}

}
