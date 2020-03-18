package com.aventix.AventixApp;

import com.aventix.AventixApp.modele.ServiceCompensation;
import java.util.Date;
import java.util.Timer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aventix.AventixApp.controller")
public class AventixAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AventixAppApplication.class, args);
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new ServiceCompensation(), 20000, 86400000);
	}

}
