package com.polymorphism;
//compile time polymorphism 
public class MethodOverloading {
	public int sum(int x, int y)
	{
		return x+y;
	}
	public int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m= new MethodOverloading();
		System.out.println(m.sum(6, 10));
		System.out.println(m.sum(4, 17, 9));
	}
}
