package com.inheritance;

public class TestCalculator extends Calculator {
	public static void main(String[] args) {
		int x=20, y=10;
		TestCalculator cal=new TestCalculator();
		cal.addition(x, y);
		cal.substraction(x, y);
		cal.multiplication(x, y);
		cal.division(x, y);
	}

}
