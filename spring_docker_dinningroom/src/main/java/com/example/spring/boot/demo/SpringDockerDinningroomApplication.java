package com.example.spring.boot.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class SpringDockerDinningroomApplication {
	@RequestMapping(method = RequestMethod.POST, value = "/distribution")
public String sendOrder() 
{
	
	return "You got an order!!!";
	
	
}
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDinningroomApplication.class, args);
	}

}
