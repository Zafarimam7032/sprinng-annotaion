package com.grwts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.grwts.vo.StudentVo;
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.grwts.vo"})

public class DublicateRunMethodClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DublicateRunMethodClass.class, args);
		StudentVo studentVo = run.getBean(StudentVo.class);
		System.out.println(studentVo.display());
		
	}
	

}
