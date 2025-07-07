package com.example.advance.feature.func;

public class MaxCalculate {

	public static void main(String[] args) {
		int a=10, b=20;
		float x = 5.5f, y = 3.3f;
		double p =12.5, q =12.7;
		
		System.out.println("Max of integers: "+max(a,b));
		System.out.println("Max of Floats: "+max(x,y));
		System.out.println("Max of doubles: "+max(p,q));
	}
	
	static int max(int num1, int num2)
	{
		return(num1>num2)?num1:num2;
	}
	static float max(float num1, float num2)
	{
		return(num1>num2)?num1:num2;
	}
	static double max(double num1, double num2)
	{
		return(num1>num2)?num1:num2;
	}
}
