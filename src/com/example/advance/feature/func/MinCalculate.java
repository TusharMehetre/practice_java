package com.example.advance.feature.func;

public class MinCalculate {

	public static void main(String[] args) {
		int result = min(8,3,5,2,7,1,4);
		System.out.println("Minimum number is: "+result);
	}
	static int min(int... numbers)//varargs pass multiple argument, java internally convert this argument in array(numbers[])
	{
		int smallest = numbers[0];
		
		for (int i=1; i<numbers.length; i++)
		{
			if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		return smallest;
	}

}
