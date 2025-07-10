package com.example.string.and.enums;

import java.util.Scanner;

public class RemoveOccurance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = scan.nextLine();
		
		String result = sentence.replaceAll("\\bthe\\b", "").replaceAll("\\s", " ").trim();
		
		System.out.println("Sentence after deleting 'the': "+ result);
	}

}
