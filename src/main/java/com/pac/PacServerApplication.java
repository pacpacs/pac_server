package com.pac;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacServerApplication.class, args);
	}
	
	@PostConstruct
    public void init() {
        
    }

}
