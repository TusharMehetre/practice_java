package com.example.array;

import java.util.Scanner;

public class NumberSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[25]; 
		
		System.out.println("Enter a 25 numbers: ");
		for(int i=0; i < 25; i++)
		{
			numbers[i] = scan.nextInt();
		}
		
		System.out.println("Enter a number to search");
		int searchNumber = scan.nextInt();
		
		int count = 0;
		for(int i=0; i<25; i++)
		{
			if(numbers[i]==searchNumber)
			{
				count++;
			}
		}
		if (count > 0)
		{
			System.out.println(searchNumber + " is present in the array");
			System.out.println("Its " + count + " times present");
		}
		else
		{
			System.out.println(searchNumber + " is not present in the array");
		}
	}

}
