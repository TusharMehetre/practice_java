package com.example.decision.control.instruction;

import java.util.Scanner;

public class DriverInsurance {

	public static void main(String[] args) {
		char sex,ms;
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age, sex, Marital Status");
		age=scan.nextInt();
		sex=scan.next().charAt(0);
		ms=scan.next().charAt(0);
		
		if ( ( ms == 'M' ) 
		  || ( ms == 'U' && sex == 'M' && age > 30 ) 
		  || ( ms == 'U' && sex == 'F' && age > 25 ) ) 
			System.out.println ( "Driver is insured" ) ; 
		else 
		{
			System.out.println("Driver is not insured");
		}
	}

}
