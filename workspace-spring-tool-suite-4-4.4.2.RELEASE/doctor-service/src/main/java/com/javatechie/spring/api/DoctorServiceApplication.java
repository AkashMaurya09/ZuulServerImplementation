package com.javatechie.spring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorServiceApplication {
	
	@GetMapping("/getDS")
	public String getDoctorService() {
		return "Diagnosis microservice called...";
	}
	
	@GetMapping("/welcome/{name}")
	public String wish(@PathVariable String name) {
		return "Hi "+name+" Welcome To Doctor Service";
	}

	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}

}
