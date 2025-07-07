package com.example.advance.feature.func;

public class FibonacciRecursive {

	public static void main(String[] args) {
		int n=25;
		System.out.println("First " + n + "Fibonacci numbers: ");
		
		for(int i=1; i<=n; i++)
		{
			System.out.println(fibonacci(i) + " ");
		}
	}
	static int fibonacci(int num)
	{
		if(num==1 || num ==2)
		{
			return 1;
		}
		else
		{
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}

}
