package com.example.classes.object;

public class Cartesian {
	private double x;
	private double y;
	
	public Cartesian(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	public Polar toPolar()  // convert cartesian to polar 
	{
		double radius = Math.sqrt(x * x + y * y);
		double angle = Math.atan2(y, x); //handle correct quadrant angle
		return new Polar(radius, angle);
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void display()
	{
		System.out.println("Cartesian Coordinates: ("+ x + ", " + y + ")");
	}
}
