package com.sa.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAccessReturnObject {

	String msgReturned;
	boolean success;
	boolean loginSuccess;
	Student student;
	Tutor tutor;

}
