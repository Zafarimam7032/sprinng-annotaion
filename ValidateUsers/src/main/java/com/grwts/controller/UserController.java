package com.grwts.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.pojo.UserInfo;

@RestController
@RequestMapping(path = "/home")
public class UserController {
	private List<UserInfo> userInfos=new ArrayList<>();
	{
		userInfos.add(new UserInfo(1,"Utsav", "1234456221", 22, "09/03/1999"));
		userInfos.add(new UserInfo(2,"Zafar", "123441", 21, "09/03/1997"));
	}
	
	@GetMapping(path = "/display")
	public List<UserInfo> display()
	{
		return userInfos;
	}
	@GetMapping(path = "/displayById/{name}")
	public UserInfo displayById(@PathVariable("name") String name)
	{
		Iterator<UserInfo> iterator = userInfos.iterator();
		while(iterator.hasNext())
		{
			UserInfo userInfo = iterator.next();
			if(userInfo.getUserName().equalsIgnoreCase(name))
			{
				return userInfo;
			}
			
		}
		return null;
		
	}

	@PostMapping(path = "/insert")
	public UserInfo insert(UserInfo userInfo)
	{
	userInfos.add(userInfo);
	return userInfo;
	}
}
