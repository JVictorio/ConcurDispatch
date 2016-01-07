package com.concur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcurDispatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcurDispatchApplication.class, args);
		System.out.println("Hello Jun");
	}
}
