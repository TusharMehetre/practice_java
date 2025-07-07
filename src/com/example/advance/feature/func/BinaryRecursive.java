package com.example.advance.feature.func;

import java.util.Scanner;

public class BinaryRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int num = scan.nextInt();
		
		System.out.println("Binary equivalent: ");
		toBinary(num);
	}
	static void toBinary(int n)
	{
		if (n>0)
		{
			toBinary(n/2);
			System.out.print(n%2);
		}
	}

}
