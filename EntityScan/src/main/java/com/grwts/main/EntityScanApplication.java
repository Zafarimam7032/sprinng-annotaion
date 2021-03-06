package com.grwts.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.grwts.vo"})
@ComponentScan(basePackages = {"com.grwts.controller,com.grwts.commandLineRunner"})
@EnableJpaRepositories(basePackages = {"com.grwts.repository"})
//@EnableJpaRepositories
public class EntityScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntityScanApplication.class, args);
	}

}
