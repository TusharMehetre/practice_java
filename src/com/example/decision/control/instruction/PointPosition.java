package com.example.decision.control.instruction;

import java.util.Scanner;

public class PointPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter x-coordinate of the point: ");
        int x = scan.nextInt();
        System.out.println("Enter y-coordinate of the point: ");
        int y = scan.nextInt();

        if (x == 0 && y == 0) 
        {
            System.out.println("The point lies on the origin (0,0).");
        } else if (x == 0) 
        {
            System.out.println("The point lies on the Y-axis.");
        } else if (y == 0) 
        {
            System.out.println("The point lies on the X-axis.");
        } else 
        {
            System.out.println("The point lies neither on X-axis, Y-axis, nor on origin.");
        }
	}

}
