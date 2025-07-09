package com.example.array;

import java.util.Scanner;

public class NumberStatistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] numbers = new int[25];
		
		int positiveCount = 0;
        int negativeCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter 25 numbers:");
        for (int i = 0; i < 25; i++) 
        {
            numbers[i] = scan.nextInt();
            
            if(numbers[i]>0)
            {
            	positiveCount++;
            }
            else if(numbers[i]<0)
            {
            	negativeCount++;
            }
            
            if(numbers[i]%2==0)
            {
            	evenCount++;
            }
            else
            {
            	oddCount++;
            }
        }
        
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount); 
	}

}
