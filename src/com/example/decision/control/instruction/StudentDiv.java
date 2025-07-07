package com.example.decision.control.instruction;

import java.util.Scanner;

public class StudentDiv {

	public static void main(String[] args) {
		int m1,m2,m3,per;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks for three subject");
		m1=scan.nextInt();
		m2=scan.nextInt();
		m3=scan.nextInt();
		per =(m1+m2+m3)*100/300;
		
		System.out.println("Percentage : " + per);
		
		if (per>=60)
		{
			System.out.println("First division");
		}
		if ((per>=50)&&(per<60))
		{
			System.out.println("Second division");
		}
		if ((per>=40)&&(per<50))
		{
			System.out.println("Third division");
		}
		if(per<40) 
		{
			System.out.println("Fail");
		}
	}

}
