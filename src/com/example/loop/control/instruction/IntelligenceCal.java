package com.example.loop.control.instruction;

import java.util.Scanner;

public class IntelligenceCal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of y: ");
        double y = scan.nextDouble();
        
        System.out.println("Enter the value of x: ");
        double x = scan.nextDouble();
        
        double i = 2 + ( y + 0.5 * x );
        
        System.out.println("The approximate level of intelligence is: " + i);
	}

}
