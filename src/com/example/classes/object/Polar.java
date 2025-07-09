package com.example.classes.object;

public class Polar {
	private double radius;
	private double angle;
	
	public Polar (double radius, double angle)
	{
		this.radius = radius ;
		this.angle = angle ;
	}
	public Cartesian toCartesian() //Convert polar to cartesian 
	{
		double x = radius * Math.cos(angle);
		double y = radius * Math.sin(angle);
		return new Cartesian(x,y);
	}
	public double getRadius()
	{
		return radius;
	}
	public double getAngle()
	{
		return angle;
	}
	public void display()
	{
		System.out.println("Polar Coordinates: (radius = " + radius + ", angle = " + angle + ")");
	}
}
