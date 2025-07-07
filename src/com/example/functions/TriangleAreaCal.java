package com.example.functions;

import java.util.Scanner;

public class TriangleAreaCal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three sides of triangle (a,b,c)");
		double a= scan.nextDouble();
		double b= scan.nextDouble();
		double c= scan.nextDouble();
		
		double area = calculateArea(a,b,c);
				
		System.out.println("Area of triangle is : "+ area);
	}
	static double calculateArea(double a , double b, double c)
	{
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}

}
