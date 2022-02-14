package com.inheritance;

public class Calculator {
	int z;
	public void addition(int x,int y)
	{
		z=x+y;
		System.out.println("the addition of x and y is"+" "+z);
	}
	public void substraction(int x,int y)
	{
		z=x-y;
		System.out.println("the substraction of x and y is"+" "+z);
	}
	public void multiplication(int x,int y)
	{
		z=x*y;
		System.out.println("the multiplication of x and y is"+" "+z);
	}
	public void division(int x,int y)
	{
		z=x/y;
		System.out.println("the division of x and y is"+" "+z);
	}

}
