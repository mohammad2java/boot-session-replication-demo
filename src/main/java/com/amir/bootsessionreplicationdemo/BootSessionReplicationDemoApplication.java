package com.amir.bootsessionreplicationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootSessionReplicationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSessionReplicationDemoApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "HomePage";
	}
}
