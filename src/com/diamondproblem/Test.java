package com.diamondproblem;

public class Test implements First,Second {
	public void display()
	{
		First.super.display();
		Second.super.display();
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.display();
	}

}
