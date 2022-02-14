package com.assignments;

public class CallbyValue {
	public void Operator(){
		int a = 10;
		int b= 30;
		System.out.println(a+b);
	
	}
	public void Method(){
		String s = "Hi";
		String h = "Sairam";
		System.out.println(s+" "+h);
	}
	public static void main(String[] args) {
		CallbyValue c = new CallbyValue();
		c.Operator();
		c.Method();
	}
}
