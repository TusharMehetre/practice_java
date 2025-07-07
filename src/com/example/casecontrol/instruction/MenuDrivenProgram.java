package com.example.casecontrol.instruction;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n===MENU===");
			System.out.println("1. Factorial of a number");
			System.out.println("2. Prime or not");
			System.out.println("3. Odd or Even");
			System.out.println("4. Exit");
			System.out.println("Enter choice 1 to 4 :");
			
			int choice = scan.nextInt();
			
			switch(choice)
			
			{
			case 1:
				System.out.println("Enter a number to find its factorial: ");
				int num = scan.nextInt();
				long fact=1;
				
				for (int i=1; i<=num; i++)
				{
					fact=fact*i;
				}
				System.out.println("Factorial of " + num + " is: " +fact);
				break;
				
			case 2:
				System.out.println("Enter a number to check prime or not: ");
				int number =scan.nextInt();
				
				boolean isPrime = true;
				if(number<=1)
				{
					isPrime=false;
				}
				else
				{
					for(int i=2; i<=number/2; i++)
					{
						if(number%i==0)
						{
							isPrime =false;
							break;
						}
					}
				}
				if(isPrime)
				{
					System.out.println(number +" is a prime number");
				}
				else
				{
					System.out.println(number +" is not a prime number");
				}
				
			case 3:
				System.out.println("Enter number to check odd or even: ");
				int n= scan.nextInt();
				if(n%2==0)
				{
					System.out.println(n + " is Even");
				}
				else 
				{
					System.out.println(n + " is Odd");
				}
				break;
				
			case 4:
				System.out.println("Existing program...");
				System.exit(0);
				break;
				
				default:
					System.out.println("Invalid choice, Please enter between 1 to 4");
			}
			
		}
	}

}
