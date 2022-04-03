package com.in28minutes.webservice.helloworld;

public class HelloWorldMessage {
	
	private String message;
	
	public HelloWorldMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldMessage [message=" + message + "]";
	}
	
	

}
