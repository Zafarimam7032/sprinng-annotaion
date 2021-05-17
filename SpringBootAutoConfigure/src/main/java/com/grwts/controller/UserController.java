package com.grwts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.vo.UserManagmentVo;

@RestController
public class UserController {
	
	
 public UserController() {
		super();
System.out.println("hi this is constructor");
 }

@GetMapping(path = "/hi")
 public UserManagmentVo displManagmentVo()
 {
	 return new UserManagmentVo("Zafar", "1232");
 }
}
