package com.example.gettingsterted;

public class GrossSalary {

	public static void main(String[] args) 
	{
		double basicSalary = 10000;  //Assume basic salary 
		double dearnessAllowance = basicSalary * 0.40; //calculate dearness allowance (DA)
		double houseRentAllowance = basicSalary * 0.20; //calculate house rent allowance (HRA)
		double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance; //calculate gross salary 
		
		 System.out.println("Ramesh's Basic Salary: " + basicSalary);
	     System.out.println("Dearness Allowance (40%): " + dearnessAllowance);
	     System.out.println("House Rent Allowance (20%): " + houseRentAllowance);
         System.out.println("Gross Salary: " + grossSalary);
	}
}
