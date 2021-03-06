package com.grwts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.repository.StudentRepository;
import com.grwts.vo.StudentVo;

@RestController 
public class StudentController {
	@Autowired(required = true)
	private StudentRepository studentRepository;
	@GetMapping( path ="/all")
	public List<StudentVo> display()
	{
		List<StudentVo> list = studentRepository.findAll();
		return list;
	}

}
