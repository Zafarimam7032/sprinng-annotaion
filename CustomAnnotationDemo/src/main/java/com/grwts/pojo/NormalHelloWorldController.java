package com.grwts.pojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grwts.annotation.CustomRestController;

@CustomRestController
public class NormalHelloWorldController {
	@GetMapping(path = "/display")

	public String display()
	{
		return "helloworld";
	}
	

}
