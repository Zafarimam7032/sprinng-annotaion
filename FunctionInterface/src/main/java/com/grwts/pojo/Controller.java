package com.grwts.pojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.iterface.FunctionalInterfacee;

@RestController
public class Controller {
	@GetMapping(path = "/home")
	public void  display()
	{
		 FunctionalInterfacee functionalInterfacee = () -> System.out.println("this is functional interface");
	}

}
