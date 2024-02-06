package com.custom.exception;

public class UnderAgeException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public UnderAgeException(String message) {
		super(message);
	}

}
