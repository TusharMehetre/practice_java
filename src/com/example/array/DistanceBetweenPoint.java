package com.example.array;

import java.util.Scanner;

public class DistanceBetweenPoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] x = new double[10];
		double[] y = new double[10];
		
		System.out.println("Enter X and Y Coordinates of 10 points: ");
		
		for(int i=0; i<10; i++)
		{
			System.out.print("Point " + (i+1) + " - X: ");
			x[i] = scan.nextDouble();
			
			System.out.print("Point " + (i+1) + " - Y: ");
			y[i] = scan.nextDouble();
		}
		
		double totalDistance = 0;
		for(int i=0; i<9; i++)
		{
			double dx = x[i+1] - x[i];
			double dy = y[i+1] - y[i];
			double distance = Math.sqrt(dx*dx + dy*dy);
			totalDistance += distance;
		}
		 System.out.printf("Total distance from first point to last point: %.2f\n", totalDistance);
		
	}

}
