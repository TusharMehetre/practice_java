package com.example.decision.control.instruction;

import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to check it is even or odd : ");
		int num = scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num + " is a even number");
		}
		else
		{
			System.out.println(num + " is a odd number");
		}
	}

}
