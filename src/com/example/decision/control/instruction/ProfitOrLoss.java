package com.example.decision.control.instruction;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the cost price and seeling price: ");
		double cp = scan.nextDouble();
		double sp = scan.nextDouble();
		
		System.out.println("The Cost Price: "+ cp + "The selling Price: "+sp);
		
		if(sp>cp)
		{
			double profit = sp-cp;
			System.out.println("Made a profit is : "+profit);
		}
		else if(cp>sp)
		{
			double loss = cp-sp;
			System.out.println("Made a loss is : "+loss);
		}
		else
		{
			System.out.println("No Profit, No loss");
		}
		
		
	}

}
