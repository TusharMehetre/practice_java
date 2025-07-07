package com.example.decision.control.instruction;

import java.util.Scanner;

public class TriangleValidity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a three angles of triangle: ");
		int angle1 = scan.nextInt();
		int angle2 = scan.nextInt();
		int angle3 = scan.nextInt();
		
		System.out.println(angle1 + " is the first angle\n" + angle2 + " is the second angle\n" + angle3 + " is the third angle");
		
		int sum = angle1+angle2+angle3;
		
		if(sum==180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
		{
			System.out.println("Triangle is valid");
		}
		else 
		{
			System.out.println("Triangle is not valid");
		}
	}

}
