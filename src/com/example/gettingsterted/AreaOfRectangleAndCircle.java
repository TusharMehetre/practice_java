package com.example.gettingsterted;

public class AreaOfRectangleAndCircle 
{
	public static void main(String args[])
	{
		double length = 10; //Length of rectangle 
		double breadth = 5; //breadth of rectangle 
		double radius = 7; //redius of circle 
		
		double rectangleArea = length * breadth; //calculate area of rectangle
		double rectanglePerimeter = 2*(length+breadth); //calculate perimeter of rectangle
		
		double circleArea = 3.14*radius*radius;
		double circleCircumference = 2*3.14*radius;
		
		System.out.println("Rectangle");
		System.out.println("Length of rectangle: " + length);
		System.out.println("Breadth of rectangle: " + breadth);
		System.out.println("Area of rectangle: " + rectangleArea);
		System.out.println("Perimeter of rectangle: " + rectanglePerimeter);
		System.out.println();
		System.out.println("Circle");
		System.out.println("Radius of circle: " + radius);
		System.out.println("Area of circle: " + circleArea);
		System.out.println("Circumference of circle: " + circleCircumference);
		
		
	}
}
