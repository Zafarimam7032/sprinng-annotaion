package com.grwts.commandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grwts.repository.StudentRepository;
import com.grwts.vo.StudentVo;
@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		StudentVo studentVo = new StudentVo(1, "Zafar imam", "New Delhi");
		studentRepository.save(studentVo);

	}

}
