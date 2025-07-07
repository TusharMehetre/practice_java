package com.example.decision.control.instruction;

import java.util.Scanner;

public class YoungestPerson {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age of the Ram, Shaym and Ajay: ");
		int ramAge = scan.nextInt();
		int shyamAge = scan.nextInt();
		int ajayAge = scan.nextInt();
		System.out.println(ramAge +" is the Ram age\n" + shyamAge + " is the shyam age\n" + ajayAge + " is the Ahay age ");
		
		if(ramAge < shyamAge && ramAge < ajayAge)
		{
			System.out.println("Ram is youngest");
		}
		else if(shyamAge < ramAge && shyamAge < ajayAge)
		{
			System.out.println("Shyam is youngest ");
		}
		else if(ajayAge < ramAge && ajayAge < shyamAge)
		{
			System.out.println("Ajay is youngest ");
		}
		else 
		{
			System.out.println("Two or more have the same youngest age");
		}
	}

}
