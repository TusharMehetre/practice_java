package com.example.string.and.enums.classes.object;

import java.util.Scanner;

public class SuccessiveVowelsCount {
	
	private String sentence;
	
	public SuccessiveVowelsCount(String sentence)
	{
        this.sentence = sentence;
    }
	
	public void countSuccessiveVowels() 
	{
        int count = 0;
        String lowerSentence = sentence.toLowerCase();

        for (int i = 0; i < lowerSentence.length() - 1; i++) 
        {
            char ch1 = lowerSentence.charAt(i);
            char ch2 = lowerSentence.charAt(i + 1);

            if (isVowel(ch1) && isVowel(ch2)) 
            {
                count++;
                System.out.println("Found: " + ch1 + "" + ch2);
            }
        }
        System.out.println("Number of occurrence of two successive vowels is " + count);
    }
	
	private boolean isVowel(char ch) 
	{
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Sentence of text: ");
        String input = scan.nextLine();
        
        SuccessiveVowelsCount svc = new SuccessiveVowelsCount(input);

        svc.countSuccessiveVowels();
	}

}
