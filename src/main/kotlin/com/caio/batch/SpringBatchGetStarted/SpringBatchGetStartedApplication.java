package com.caio.batch.SpringBatchGetStarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBatchGetStartedApplication {

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(SpringBatchGetStartedApplication.class, args)));
	}
}