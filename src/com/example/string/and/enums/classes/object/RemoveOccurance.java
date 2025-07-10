package com.example.string.and.enums.classes.object;

import java.util.Scanner;

public class RemoveOccurance {
	
	private String sentence;
	
	public RemoveOccurance(String sentence)
	{
        this.sentence = sentence;
    }
	
	 public String removeOccurrence() 
	 	{
	        String result = sentence.replaceAll("\\bthe\\b", "").replaceAll("\\s+", " ").trim();
	        return result;
	    }
	 
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.println("Enter a sentence: ");
	        String input = scan.nextLine();

	        RemoveOccurance remover = new RemoveOccurance(input);

	        String output = remover.removeOccurrence();

	        System.out.println("Sentence after deleting 'the': " + output);
	    }
}
