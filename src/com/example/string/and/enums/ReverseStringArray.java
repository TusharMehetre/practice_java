package com.example.string.and.enums;

public class ReverseStringArray {

	public static void main(String[] args) {
		String s[] =
			{
				"To err is human...", 
				 "But to really mess things up...", 
				 "One needs to know Java!!"
			};
		System.out.println("Original Strings: ");
		for(String str : s)
		{
			System.out.println(str);
		}
		
		System.out.println("\nReversed strings");
		for(int i=0; i<s.length; i++)
		{
			String reversed = new StringBuilder(s[i]).reverse().toString();
			System.out.println(reversed);
		}
	}

}
