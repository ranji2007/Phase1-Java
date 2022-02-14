package com.abstraction;

public class Square extends Shape {
	private double area;
	public Square(double area,String color)
	{
		super(color);
		this.area=area;
	}
	
	double area() {
		return area*area;
	}

	@Override
	public String toString() {
		return "Square color=" + getColor() + " and area is "+area();
	}

}
