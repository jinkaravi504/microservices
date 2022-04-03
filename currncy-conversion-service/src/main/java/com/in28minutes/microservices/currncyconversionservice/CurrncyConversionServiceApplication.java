package com.in28minutes.microservices.currncyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CurrncyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrncyConversionServiceApplication.class, args);
		
		//http://localhost:8100
	}

}
