package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages = {"hello","com.ensat.controllers", "com.ensat.services"})
@EntityScan("com.ensat.entities")
@EnableJpaRepositories("com.ensat.repositories")
@RestController
public class DemoApplication {

	@GetMapping("/")
	String home() {
		return "Spring is here3!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}