package com.example.loop.control.instruction;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to print multiplication table: ");
        int number = scan.nextInt();
        
        System.out.println("Multiplication table of " + number + ":");
        
        for(int i=1; i<=10; i++) 
        {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
	}

}
