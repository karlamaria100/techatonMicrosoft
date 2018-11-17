package com.techathon.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.techathon")
public class TechathonApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechathonApplication.class, args);
	}
}
