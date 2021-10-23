package com.hack2hire.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages={"com.hack2hire"})
public class Hack2HireApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hack2HireApplication.class, args);
	}

}
