package com.example.string.and.enums;

import java.util.Scanner;

public class AbbreviateNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the full name: ");
		String fullName = scan.nextLine();
		
		String[] parts = fullName.split("\\s+");
		
		int n = parts.length;
		
		if(n==1)
		{
			System.out.println("Abbreviated name: "+ parts[0]);
		}
		else
		{
			StringBuilder abbreviated = new StringBuilder();
			
			for(int i=0; i<n-1; i++)
			{
				abbreviated.append(parts[i].charAt(0)).append(". ");
			}
			abbreviated.append(parts[n-1]);
			System.out.println("Abbreviated Name: "+ abbreviated.toString());
		}
	}

}
