package com.exception;

public class PaawordNotValidException extends Exception{

	private String msg;
	
	public PaawordNotValidException(String msg) {
		
		this.msg=msg;
	}

	@Override
	public String toString() {
		return "PaawordNotValidException [message=" + msg + "]";
	}
	
	
}
