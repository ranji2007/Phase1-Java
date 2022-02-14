package com.exceptionhandling;

public class UnCheckedException {
	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		int c=a/b;
       try {
	         System.out.println(c);
           }
      catch(ArithmeticException  e){
	        e.getMessage();
       }
	}
	//index out of bond
	//number format exception
	//null pointer exception


}
