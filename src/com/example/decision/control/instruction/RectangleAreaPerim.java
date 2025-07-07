package com.example.decision.control.instruction;

import java.util.Scanner;

public class RectangleAreaPerim {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        int length = scan.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        int breadth = scan.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        if (area > perimeter) 
        {
            System.out.println("Area is greater than perimeter.");
        } else 
        {
            System.out.println("Area is not greater than perimeter.");
        }

	}

}
