package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewApplication {
	
	 @GetMapping("/api")
	  public String home() {
	    return "Welcome Docker World";
	  }

	public static void main(String[] args) {
		SpringApplication.run(NewApplication.class, args);
	}

}
