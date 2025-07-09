package com.example.array;

import java.util.Scanner;

public class ReverseCopyArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		int n = scan.nextInt();
		
		int [] original = new int[n];
		int [] reversed = new int[n];
		
		System.out.println("Enter " + n + " elements:");
		for(int i=0; i<n; i++)
		{
			original[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			reversed[i] = original[n - 1 - i];
		}
		
		System.out.println("Original array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(original[i] + " ");
		}
		
		System.out.println("\nReversed Array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(reversed[i] + " ");
		}
	}

}
