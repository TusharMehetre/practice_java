package com.example.advance.feature.func;

public class FindMin {

	public static void main(String[] args) {
		int min1 = fun(5, 3, 9, 2, 8);
		System.out.println("Minimum number is: "+min1);
		
		 int min2 = fun(12, 15, 7, 19);
	     System.out.println("Minimum number is: " + min2);
	}
	
	static int fun(int... numbers)
	{
		int min=numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]<min)
			{
				min=numbers[i];
			}
		}
		return min;
	}
	
}
