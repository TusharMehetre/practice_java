package com.example.advance.feature.func;

import java.util.Scanner;

public class PrimeFactorRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = scan.nextInt();
		
		System.out.println("Prime factors: ");
		primeFactors(number,2);
	}
	
	static void primeFactors(int n, int i)
	{
		if(n==1)
		{
			return; //base case : recursion stop when n becomes 1
		}
		if(n%i==0)
		{
			System.out.println(i+ " ");
			primeFactors(n/i,i); //keep same divisor i
		}
		else
		{
			primeFactors(n,i+1);  //try next number
		}
	}

}
