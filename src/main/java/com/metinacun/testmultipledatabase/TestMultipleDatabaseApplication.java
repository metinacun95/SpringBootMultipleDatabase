package com.metinacun.testmultipledatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestMultipleDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMultipleDatabaseApplication.class, args);
	}

}
