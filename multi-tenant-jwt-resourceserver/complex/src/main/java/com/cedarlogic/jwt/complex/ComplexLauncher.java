package com.cedarlogic.jwt.complex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ComplexLauncher {

	public static void main(String[] args) {
		SpringApplication.run(ComplexLauncher.class, args);
	}

	@RestController
	public static class MyController {
		@GetMapping("/")
		public String getHello(Authentication authentication) {
			return "hello" + authentication.getName();
		}
	}

}
