package com.example.loop.control.instruction;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) 
        {
            System.out.println("Set " + i + ":");
            
            System.out.println("Enter principal amount (p): ");
            double p = scan.nextDouble();
            
            System.out.println("Enter annual interest rate (r in %): ");
            double r = scan.nextDouble();
            
            System.out.println("Enter number of years (n): ");
            double n = scan.nextDouble();
            
            System.out.println("Enter number of times interest is compounded per year (q): ");
            double q = scan.nextDouble();
            
            double ratePerPeriod = r / (100 * q); // Convert r to fraction: r / 100
            
            double totalPeriods = n * q;// Calculate total number of compounding periods: n * q
            
            double a = p * Math.pow(1 + ratePerPeriod, totalPeriods); // Calculate amount a
            
            System.out.printf("The compounded amount (a) is: %.2f\n\n", a);
        }
	}

}
