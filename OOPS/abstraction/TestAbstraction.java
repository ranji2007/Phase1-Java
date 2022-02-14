package com.abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		Shape s1=new Square(5,"Orange");
		Shape s2=new Triangle(4,8,"Red");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
