package com.example.java.datatypes.instruction;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//user input 
		System.out.println("Enter 2 number (C)(D): ");
		int C =scan.nextInt();
		int D = scan.nextInt();
		
		System.out.println("Before swapping: C =" + C + ", D =" + D);
		
		int temp = C;
		C = D;
		D = temp;
		
		System.out.println("Before swapping: C =" + C + ", D =" + D);
		
	}

}
