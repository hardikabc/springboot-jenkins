package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
		System.out.println("End");
		System.out.println("Hello Mukesh");
	}

}
