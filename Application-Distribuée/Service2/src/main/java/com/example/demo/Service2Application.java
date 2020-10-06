package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Service2Application {

	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}
	
	@Bean
	CommandLineRunner start( CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null,"Jean","Jean12@yahoo.fr"));
			customerRepository.save(new Customer(null,"François","François@yahoo.fr"));
			customerRepository.save(new Customer(null,"René","René@gmail.com"));
			System.out.println("ça marche !");
		};
		
	}
}
