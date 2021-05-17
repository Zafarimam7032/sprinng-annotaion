package com.grwts.conroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.vo.UserInfo;

@RestController
public class UserController {
 @GetMapping(path = "/display")
	public UserInfo display()
	{
		return new UserInfo("Utsav","12321","New Delhi");
	}
 @GetMapping(path = "/display1")
	public List<UserInfo> display1()
	{
	List<UserInfo> list = new ArrayList<UserInfo>();
	 
	list.add(new UserInfo("Utsav","12321","New Delhi"));
	list.add(new UserInfo("Zafar","1232121","New Delhi"));
	return list;
	}
}
