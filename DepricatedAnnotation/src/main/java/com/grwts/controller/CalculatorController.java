package com.grwts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.depricated.DepricatedImplimentation;

@RestController
public class CalculatorController {
	@Autowired
	@Qualifier("getDepricatedImplimentationObject")
	private DepricatedImplimentation depricatedImplimentatio;
	@GetMapping(path = "/display")
	public int  display()
	{
		int add = depricatedImplimentatio.add();
		return add;
		
	}
	@GetMapping(path = "/display2")
	public int  displaySub()
	{
		int add = depricatedImplimentatio.sub();
		return add;
		
	}
	@GetMapping(path = "/display3")
	public int  displaySubs()
	{   DepricatedImplimentation depricatedImplimentation1=new DepricatedImplimentation(100, 200);
		int add = depricatedImplimentation1.sub();
		return add;
		
	}
}
