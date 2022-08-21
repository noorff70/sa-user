package com.sa.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.sa.user.model.Student;
import com.sa.user.model.UserAccessReturnObject;

@FeignClient(name="sa-mysql")
@Service
public interface UserService {
	
	@PostMapping("/ui/register/user")
	public String RegisterUser(Student student);
	
	@PostMapping("/ui/login/user")
	public UserAccessReturnObject loginUser(Student student);

}
