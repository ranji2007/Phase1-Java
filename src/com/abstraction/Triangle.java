package com.abstraction;

public class Triangle extends Shape {
	private double base;
	private double height;
	public Triangle(double base,double height,String color) {
		super(color);
		this.base=base;
		this.height=height;
	}
	double area()
	{
		return base*height/2;
	}
	@Override
	public String toString() {
		return "Triangle color=" + getColor() + " and area is "+area();
	}

}
