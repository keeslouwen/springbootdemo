package com.example.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Spring Boot 2.x
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@RestController
public class DemoDockerApplication extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String home() {
        return "Hello Amsterdam";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
