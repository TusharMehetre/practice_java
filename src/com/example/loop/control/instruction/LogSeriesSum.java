package com.example.loop.control.instruction;

import java.util.Scanner;

public class LogSeriesSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		double x = scan.nextDouble();
		
		double sum=0;
		double term = (x-1)/x;
		
		for(int i=1; i<=7; i++)
		{
			double currentTerm = (1.0/i)*Math.pow(term, i);
			sum=sum+currentTerm;
		}
		System.out.println("Sum of first seven terms of the series = "+ sum);
	}

}
