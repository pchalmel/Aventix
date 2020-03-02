package com.ProjetTransversal.AventixSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AventixSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AventixSpringBootApplication.class, args);
	}

}
