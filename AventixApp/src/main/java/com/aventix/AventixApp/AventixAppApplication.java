package com.aventix.AventixApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aventix.AventixApp.controller")
public class AventixAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AventixAppApplication.class, args);
	}

}
