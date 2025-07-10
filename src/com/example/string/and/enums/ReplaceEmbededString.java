package com.example.string.and.enums;

import java.util.Scanner;

public class ReplaceEmbededString {

	public static void main(String[] args) {
		String str[] = 
			{
					"We will teach you how to...",
		            "Move a mountain",
		            "Erase the past",
		            "Make a million",
		            "...all through Java!"
			};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string to replaced with str1 : ");
		String str1 = scan.nextLine();
		
		System.out.println("Enter a new string str2: ");
		String str2 = scan.nextLine();
		
		for(int i=0; i<str.length; i++)
		{
			if(str[i].contains(str1))
			{
				str[i] = str[i].replace(str1, str2);
			}
		}
		
		System.out.println("\nUpdated String: ");
		for(String s : str)
		{
			System.out.println(s);
		}
	}

}
