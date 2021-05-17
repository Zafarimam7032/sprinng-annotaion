package com.grwts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.grwts.vo.StudentVo;

@SpringBootApplication
public class MultipicationRunMethodApplication {

	private void display() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MultipicationRunMethodApplication.class, args);
		StudentVo studentVo = run.getBean(StudentVo.class);
		System.out.println(studentVo.display());
		
	}

}
