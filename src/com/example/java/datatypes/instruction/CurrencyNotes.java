package com.example.java.datatypes.instruction;

import java.util.Scanner;

public class CurrencyNotes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount to withdraw: ");
		int amt = scan.nextInt();
		
		int hundredNotes = amt/100;
		amt=amt%100;
		
		int fiftyNotes = amt/50;
		amt=amt%50;
		
		int tenNotes = amt/10;
		
		System.out.println("Number of notes: ");
		System.out.println("100: " + hundredNotes);
		System.out.println("50: " + fiftyNotes);
		System.out.println("10: " + tenNotes);
	}

}
