package com.rowling.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RowlingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RowlingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
	}	
}
