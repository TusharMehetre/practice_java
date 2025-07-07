package com.example.decision.control.instruction;

import java.util.Scanner;

public class TriangleType 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a three sides of triangle: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(a + " is the first side\n" + b + " is the second side\n" + c + " is the third side");
		
		if(a+b>c && a+c>b && b+c>a)
		{
			if(a==b && b==c)
			{
				System.out.println("It is a equilateral triangle");
			}
			else if(a == b || b==c || a==c)
			{
				System.out.println("It is a Isoscale Triangle");
			}
			else 
			{
				System.out.println("It is a scalene triangle");
			}
			
			int largest = a;
			int side1 = b, side2 = c;
			
			if(b>largest)
			{
				largest=b;
				side1=a;
				side2=c;
			}
			if(c > largest)
			{
				largest = c;
				side1=a;
				side2=b;
			}
			 if (largest * largest == side1 * side1 + side2 * side2)
			 	{
	                System.out.println("It is also a Right-angled Triangle.");
	            }
		}
		 else 
		 	{
	            System.out.println("The sides do not form a valid triangle.");
	        }
	}
}
