package com.kharileigh.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"Controller", "Service"})
public class PalindromeSpringbootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromeSpringbootMvcApplication.class, args);
	}

}
