package com.example.functions;

public class MultipleDatatype {

	public static void main(String[] args) {
		int a =2;
		float b = 3.5f;
		double c =4.8;
		
		double result = fun(a,b,c);
		System.out.println("Result is: " +result);
	}
	static double fun(int i, float f, double d)
	{
		double r = i*f*d;
		return r;
	}

}
