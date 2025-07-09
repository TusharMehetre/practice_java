package com.example.array;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][][] jaggedArray = new int[2][][];
		
		//First 2D array of 3 rows , length 4,3,2
		jaggedArray[0] = new int[3][];
		jaggedArray[0][0] = new int[] {1,2,3,4};
		jaggedArray[0][1] = new int[] {5,6,7};
		jaggedArray[0][2] = new int[] {8,9};
		
		//Second 2D array of 2 rows, length 3,4
		jaggedArray[1] = new int[2][];
		jaggedArray[1][0] = new int[] {10,11,12};
		jaggedArray[1][1] = new int[] {13,14,15,16};
		
		System.out.println("First 2D Array: ");
		System.out.println(jaggedArray[0][0][0] + " " + jaggedArray[0][0][1] + " " + jaggedArray[0][0][2] + " " + jaggedArray[0][0][3]);
		System.out.println(jaggedArray[0][1][0] + " " + jaggedArray[0][1][1] + " " + jaggedArray[0][1][2]);
        System.out.println(jaggedArray[0][2][0] + " " + jaggedArray[0][2][1]);
        
        System.out.println("Second 2D Array:");
        System.out.println(jaggedArray[1][0][0] + " " + jaggedArray[1][0][1] + " " + jaggedArray[1][0][2]);
        System.out.println(jaggedArray[1][1][0] + " " + jaggedArray[1][1][1] + " " + jaggedArray[1][1][2] + " " + jaggedArray[1][1][3]);
	}

}
