package com.example.functions;

import java.util.Scanner;

public class ProductCal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Float value: ");
		float num1 = scan.nextFloat();
		
		System.out.println("Enter a Integer value: ");
		int num2 = scan.nextInt();
		
		float product = multiply(num1,num2);
		
		System.out.println("Product of " + num1 + " and" + num2 + " is:" +product);
	}
	static float multiply(float f, int i)
	{
		float result = f*i;
		return result;
	}

}
