package com.example.string.and.enums.classes.object;

public class ReverseStringArray {
	
	private String s[] =
		{
			"To err is human...", 
			 "But to really mess things up...", 
			 "One needs to know Java!!"
		};
	
	 public void printOriginalStrings() 
	 	{
	        System.out.println("Original Strings:");
	        for (String str : s) 
	        {
	            System.out.println(str);
	        }
	    }
	 
	 public void printReversedStrings() 
	 	{
	        System.out.println("\nReversed Strings:");
	        for (String str : s) 
	        {
	            String reversed = new StringBuilder(str).reverse().toString();
	            System.out.println(reversed);
	        }
	    }
	 
	 

	public static void main(String[] args) {
		ReverseStringArray rsa = new ReverseStringArray();
		
		rsa.printOriginalStrings();
        rsa.printReversedStrings();
	}

}
