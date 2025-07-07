package com.example.loop.control.instruction;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = scan.nextInt();

        System.out.println("Enter the exponent: ");
        int exponent = scan.nextInt();

        int result = 1;

        for(int i = 1; i <= exponent; i++) 
        {
            result = result * base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	}

}
