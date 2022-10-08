package com.maveric.mavericecom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Slf4j
@SpringBootApplication
@EnableJpaRepositories
@EnableWebMvc
public class MavericEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavericEcomApplication.class, args);
	}

}
