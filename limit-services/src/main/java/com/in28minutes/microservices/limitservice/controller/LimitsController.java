package com.in28minutes.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitservice.bean.Limits;
import com.in28minutes.microservices.limitservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	private @Autowired Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		
	}

}
