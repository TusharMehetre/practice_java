package com.example.functions;

import java.util.Scanner;

public class FactorialCalculate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial: ");
		int num = scan.nextInt();
		
		long factorial = calculateFactorial(num);
		
		System.out.println("Factorial of " + num + " is: "+factorial);
	}
	
	static long calculateFactorial(int n)
	{
		long fact =1;
		for(int i =1; i<=n; i++)
		{
			fact = fact * i;
		}
		return fact;
	}

}
