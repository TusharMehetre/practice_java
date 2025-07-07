package com.example.loop.control.instruction;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int num = 2; num<=300; num++)
		{
			boolean isPrime = true;
			
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
			 if (!isPrime)
			 	{
	                continue;
	            }
			 System.out.println(num);
		}
	}

}
