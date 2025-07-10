package com.example.string.and.enums;

import java.util.Scanner;

public class DeleteVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = scan.nextLine();
		
		String result ="";
		
		for(int i=0; i<sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			
			if(ch != 'a'  && ch != 'e'  && ch != 'i'  && ch != 'o'  && ch != 'u'  && 
			   ch != 'a'  && ch != 'E'  && ch != 'I'  && ch != 'O'  && ch != 'U' )
			{
				result = result + ch;
			}
		}
		
		System.out.println("After deleting vovels sentence: "+ result);
	}

}
