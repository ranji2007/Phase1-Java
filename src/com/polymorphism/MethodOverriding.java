package com.polymorphism;
class Parent
{
	public void test() {
		System.out.println("this is parent class method");
	}
}
class Child extends Parent
{
	public void test() {
		//super.test(); can call parent class method
		System.out.println("this is child class method");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Child c= new Child();
		c.test();
		
		Parent p= new Child();
		p.test();
	}
	

}
