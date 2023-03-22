package com.sa.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sa.user.model.EmailObject;
import com.sa.user.service.SendEmailService;



@RestController
public class EmailController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SendEmailService sendMessage;
	
	@PostMapping("/user/email/sendEmail" )
	public boolean sendEmail (@RequestBody EmailObject message) {
		sendMessage.sendMail(message);
		
		return true;
	}
	
	/*@GetMapping ("/email/test")
	public boolean testController (@RequestParam("TEST") String desc) {
		
		return true;
		
	}*/

}
