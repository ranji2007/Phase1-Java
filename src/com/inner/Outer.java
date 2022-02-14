package com.inner;

public class Outer {
	public int a=20;
	private int b=4;
	public int c=a/b;
	
	class Inner
	{
		public void display()
		{
			System.out.println("Value of c "+c);
		}
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		
		inner.display();
	}

}
