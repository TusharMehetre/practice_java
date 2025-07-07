package com.example.functions;

import java.util.Scanner;

public class PowerCalculate {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a base(a): ");
		int a = scan.nextInt();
		
		System.out.println("Enter a exponent(b): ");
		int b = scan.nextInt();
		
		long result = power(a,b);
		
		System.out.println(a + " raised to the power " + b + " is: " +result);
	}
	
	static long power(int a, int b)
	{
		long result =1;
		for (int i=1; i<=b; i++)
		{
			result = result * a;
		}
	return result;
	}
}
