package com.assignments;


public class MethodDemo {
	public void print()
	{
		System.out.println("Methods without return type and without perameter");
	}
//Methods without return type and with one parameter
	public void display(String name)
	{
		System.out.println("My name is"+" "+name);
	}
//methods with return type and parameter
	public int cube(int n)
	{
		return n*n*n;
		
	}
//method with return string with two parameters
	public String fullname(String fname, String lname)
	{
		return fname+" "+lname;
	}
//method overloading
//method name same and parameter different
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, float b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MethodDemo x=new MethodDemo();
		x.display("ram");
		String y=x.fullname("sai","ram");
		System.out.println("Fullname is"+" "+y);
		System.out.println(x.cube(6));
		System.out.println("addition of two int numbers is \t"+x.add(20,10));
		System.out.println("addition of two float numbers is"+" "+x.add(20.46f,10.89f));
	}
}
