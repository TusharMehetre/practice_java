package com.example.gettingsterted;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 5 subject marks of students: ");
		int sub1 = scan.nextInt();
		int sub2 = scan.nextInt();
		int sub3 = scan.nextInt();
		int sub4 = scan.nextInt();
		int sub5 = scan.nextInt();
		
		//now calculate the aggrgate
		int aggregate = sub1+sub2+sub3+sub4+sub5;
		
		//now calculate the percentage 
		double per = (aggregate/500.0)*100;
		
		System.out.println("Aggregate marks: " + aggregate);
		System.out.println("Percentage: " + per + "%");
	}

}
