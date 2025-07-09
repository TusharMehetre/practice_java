package com.example.array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		int[][] transpose = new int[4][4];
		
		System.out.println("Enter elements of 4 X 4 matrx: ");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				matrix[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				transpose[j][i] = matrix[i][j];
			}
		}
		
		System.out.println("\nOriginal Matrix: ");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose Matrix: ");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
