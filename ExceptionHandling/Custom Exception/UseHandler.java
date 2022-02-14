package com.exception;

public class UseHandler {

	static void check(int pass) throws PaawordNotValidException
	{
		if(pass<8)
			throw new PaawordNotValidException("password is invalid");
		//throw used to throw an exception
		else
			System.out.println("password is generated");
	}
	
	public static void main(String[] args) {
		
		try {
			check(9);
			
		} catch (PaawordNotValidException e) {
			
			System.out.println(e);
		}
	}
}