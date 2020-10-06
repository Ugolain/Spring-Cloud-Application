package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInventoryApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return args ->{
			productRepository.save(new Product(null,"HP 878",800));
			productRepository.save(new Product(null,"Dell 30",750));
			productRepository.save(new Product(null,"lenovo Cool",820));
			System.out.println("ça marche aussi!");
		};
		
	}
	
}
