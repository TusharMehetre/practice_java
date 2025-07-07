package com.example.loop.control.instruction;

public class SumOfSeries {

	public static void main(String[] args) {
		
		double sum = 0;
		for(int i=1; i<=7; i++)
		{
			long fact = 1;
			for(int j=1; j<=i; j++)
			{
				fact = fact * j;
			}
			sum = sum + (double) i /fact;
		}
		
		System.out.printf("Sum of first seven terms of the series = %.4f", sum);
	}

}
