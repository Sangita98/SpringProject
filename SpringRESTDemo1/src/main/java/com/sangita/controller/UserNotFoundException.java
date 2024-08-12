package com.sangita.controller;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID =1L;
	
	UserNotFoundException(String msg) {
		super (msg);
	}
}
