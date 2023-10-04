package com.method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan("com.controller")
@EntityScan("com.model")
@EnableJpaRepositories("com.Repository")

public class SpringEndToEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEndToEndApplication.class, args);
	}
}
