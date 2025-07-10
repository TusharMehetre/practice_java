package com.example.string.and.enums.classes.object;

import java.util.Scanner;

public class DeleteVowels {
	
	private String sentence;
	
	 public DeleteVowels(String sentence) 
	 	{
	        this.sentence = sentence;
	    }
	 public String removeVowels() 
	 	{
	        String result = "";

	        for (int i = 0; i < sentence.length(); i++) 
	        	{
	            	char ch = sentence.charAt(i);

	            	if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
	            		ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
	                result = result + ch;
	            }
	        }
	        return result;
	    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String input = scan.nextLine();

        DeleteVowels dv = new DeleteVowels(input);

        String output = dv.removeVowels();
        System.out.println("After deleting vowels sentence is: " + output);
	}

}
