package com.sa.user.service;

import com.sa.user.model.EmailObject;

public interface SendEmailService {
	
	public boolean sendMail(EmailObject msg);

}
