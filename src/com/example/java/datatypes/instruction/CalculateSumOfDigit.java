package com.example.java.datatypes.instruction;

import java.util.Scanner;

public class CalculateSumOfDigit 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 5 digit number: ");
		int num = scan.nextInt();
		
		int sum=0;
		for(int i=0; i<5; i++)
		{
			sum += num%10;
			num = num/10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}
