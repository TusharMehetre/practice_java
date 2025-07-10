package com.example.string.and.enums;

import java.util.Scanner;

public class SuccessiveVowelsCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Sentence of text: ");
		String sentence = scan.nextLine();
		
		int count =0;
		
		String lowerSentence = sentence.toLowerCase();
		
		for(int i=0; i<lowerSentence.length()-1; i++)
		{
			char ch1 = lowerSentence.charAt(i);
			char ch2 = lowerSentence.charAt(i+1);
			
			if((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') &&
	           (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'))
			{
				count++;
				System.out.println("Found: " + ch1 + "" + ch2);
			}
		}
		System.out.println("Number of occurance of two successive vowels is "+count);
	}

}
