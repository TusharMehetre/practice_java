package com.example.java.datatypes.instruction;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a 5 digit number");
		int number = scan.nextInt();
		
		int reverse = 0;
		
		while(number !=0)
		{
			int digit = number%10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		
		System.out.println("Reversed number: "+ reverse);
	}

}
