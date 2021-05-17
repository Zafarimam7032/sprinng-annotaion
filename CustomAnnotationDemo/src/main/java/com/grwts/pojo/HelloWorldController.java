package com.grwts.pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grwts.annotation.CustomController;

@Controller
public class HelloWorldController {
	@GetMapping(path="/hello")
	@ResponseBody
	public String display()
	{
		System.out.println("this is helle world  program");
		return "hello World";
	}

}
