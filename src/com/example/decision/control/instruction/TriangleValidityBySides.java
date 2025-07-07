package com.example.decision.control.instruction;

import java.util.Scanner;

public class TriangleValidityBySides {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a three sides of triangle: ");
		int side1 = scan.nextInt();
		int side2 = scan.nextInt();
		int side3 = scan.nextInt();
		
		System.out.println(side1 + " is the first side\n" + side2 + " is the second side\n" + side3 + " is the third side");
		
		 if (side1 + side2 > side3 && 
		     side2 + side3 > side1 && 
		     side1 + side3 > side2)
		 {
			 System.out.println("Triangle is valid");
		 }
		 else 
		 {
			 System.out.println("Triangle is not valid");
		 }
	}

}
