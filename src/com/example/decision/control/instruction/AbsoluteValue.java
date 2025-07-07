package com.example.decision.control.instruction;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter any number: ");
	        int number = scan.nextInt();

	        int absoluteValue;
	        if (number < 0) 
	        {
	            absoluteValue = -number; // negate it
	        } else 
	        {
	            absoluteValue = number;
	        }

	        System.out.println("Absolute value: " + absoluteValue);
	    }
	}


