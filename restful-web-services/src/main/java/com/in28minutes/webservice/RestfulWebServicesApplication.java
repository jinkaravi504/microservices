package com.in28minutes.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
		/*
		 * URI location= ServletUriComponentsBuilder .fromCurrentRequest() .path("{id}")
		 * .buildAndExpand(1) .toUri(); ResponseEntity.created(location).build();
		 */
	}

}
