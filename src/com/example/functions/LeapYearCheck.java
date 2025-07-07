package com.example.functions;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = scan.nextInt();
		
		boolean isLeap = isLeapYear(year);
		
		if(isLeap)
		{
			System.out.println(year + " is a Leap year");
		}
		else
		{
			System.out.println(year + " is not a Leap year");
		}
	}
	
	static boolean isLeapYear(int year)
	{
		if(year%400==0)
		{
			return true;
		}
		else if(year%100==0)
		{
			return false;
		}
		else if(year%4==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
