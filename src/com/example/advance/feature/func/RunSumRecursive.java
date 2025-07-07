package com.example.advance.feature.func;

public class RunSumRecursive {

	public static void main(String[] args) {
		System.out.println("Running sum of first 25 natural numbers");
		runningSum(1,0);
	}
	static void runningSum(int n, int sum)
	{
		if(n>25)
		{
			return;
		}
		else
		{
			sum=sum+n;
			System.out.print(sum + " ");
			runningSum(n+1,sum);
		}
	}

}
