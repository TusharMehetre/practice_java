package com.example.string.and.enums.classes.object;

import java.util.Scanner;

public class ReplaceEmbededString {
	
	private String str[] = 
		{
				"We will teach you how to...",
	            "Move a mountain",
	            "Erase the past",
	            "Make a million",
	            "...all through Java!"
		};
	
	public void replaceEmbeddedString(String str1, String str2)
	{
        for (int i = 0; i < str.length; i++) 
        {
            if (str[i].contains(str1)) 
            {
                str[i] = str[i].replace(str1, str2);
            }
        }
    }
	
	 public void printStrings() 
	 	{
	        System.out.println("\nUpdated String: ");
	        for (String s : str) 
	        {
	            System.out.println(s);
	        }
	    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ReplaceEmbededString replacer = new ReplaceEmbededString();
		
		 System.out.println("Enter a string to be replaced (str1): ");
	     String str1 = scan.nextLine();

	     System.out.println("Enter a new string (str2): ");
	     String str2 = scan.nextLine();
	     
	     replacer.replaceEmbeddedString(str1, str2);
	     
	     replacer.printStrings();
	}

}
