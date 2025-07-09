package com.example.array;

import java.util.Scanner;

public class SwapOddEvenElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter size of array: ");
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter " + n + " elements:");
		for(int i=0; i<n; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int oddIndex = 0;
		int evenIndex = 0;
		
		while(true)
		{
			while(oddIndex < n && arr[oddIndex]%2 == 0 )
			{
				oddIndex++;
			}
			while(evenIndex < n && arr[evenIndex]%2 != 0)
			{
				evenIndex++;
			}
			if(oddIndex >= n || evenIndex >= n)
			{
				break;
			}
			
			int temp = arr[oddIndex];
			arr[oddIndex] = arr[evenIndex];
			arr[evenIndex] = temp;
		}
		
		 System.out.println("Interchanging odd and even elements:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(arr[i] + " ");
	        }
	}

}
