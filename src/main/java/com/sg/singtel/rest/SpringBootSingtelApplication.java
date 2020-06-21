package com.sg.singtel.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sg.singtel.rest.controller")
public class SpringBootSingtelApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSingtelApplication.class, args);
	}
}
