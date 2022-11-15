package com.polar.toDo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LiveRaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveRaryApplication.class, args);
	}

}
