package com.example.advance.feature.func;

import java.util.Scanner;

public class SumOfDigitRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 5-digit number: ");
		int number = scan.nextInt();
		
		int sum = sumOfDigits(number);
		
		System.out.println("Sum of digits: "+sum);
	}
	
	static int sumOfDigits(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else 
		{
			return(n%10) + sumOfDigits(n/10);
		}
	}
}
