package com.in28minutes.webservice.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloWorldRestController {
	@Autowired
	private MessageSource messageSource;

	@GetMapping("/hello-world")
	public String sayHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldMessage sayHelloWorldBean() {
		return new HelloWorldMessage("Hello World");
	}
	
	@GetMapping("/hello-world-ii8n")
	public String sayHelloWorldIi8n(@RequestHeader(name="Accept-Language",required = false) Locale locale) {
		return messageSource.getMessage("message.hello.world", null, locale);
	}
	
}
