package com.sa.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sa.user.model.Student;
import com.sa.user.model.UserAccessReturnObject;
import com.sa.user.service.UserService;

@RestController
public class UserAccessController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user/registration/newuser")
	public String registerUser(@RequestBody Student student) {
		
		String status = userService.RegisterUser(student);
		
		return status;
		
	}
	
	@PostMapping("/user/login/currentuser")
	public UserAccessReturnObject loginUser (@RequestBody Student student) {
		
		return userService.loginUser(student);
		
	}

}
