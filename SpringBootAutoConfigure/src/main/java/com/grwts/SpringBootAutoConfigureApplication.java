package com.grwts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration
@EnableAutoConfiguration()
@ComponentScan(basePackages = {"com.grwts.*"})
public class SpringBootAutoConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoConfigureApplication.class, args);
	}

}
