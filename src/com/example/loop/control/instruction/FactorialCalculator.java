package com.example.loop.control.instruction;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = scan.nextInt();

        long factorial = 1;

 
        for(int i = 1; i <= n; i++) 
        {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
	}

}
