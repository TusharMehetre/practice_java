package com.example.decision.control.instruction;

import java.util.Scanner;

public class PointInCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter x-coordinate of circle center: ");
        int x = scan.nextInt();
        System.out.println("Enter y-coordinate of circle center: ");
        int y = scan.nextInt();

        System.out.println("Enter radius of the circle: ");
        int r = scan.nextInt();

        System.out.println("Enter x-coordinate of the point: ");
        int px = scan.nextInt();
        System.out.println("Enter y-coordinate of the point: ");
        int py = scan.nextInt();

        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));

        if (distance < r) 
        {
            System.out.println("The point lies inside the circle.");
        } else if (distance == r) 
        {
            System.out.println("The point lies on the circle.");
        } else 
        {
            System.out.println("The point lies outside the circle.");
        }

	}

}
