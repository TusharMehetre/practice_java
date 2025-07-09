package com.example.classes.object;

public class MainCoordinate {
	public static void main(String args[]) {
		
		Cartesian cartesianPoint = new Cartesian(3,4);  //creating cartesian point 
		cartesianPoint.display();
		
		Polar polarPoint = cartesianPoint.toPolar();   //Convert to polar 
		polarPoint.display();
		
		Cartesian cartesianPoint2 = polarPoint.toCartesian();
		cartesianPoint2.display();
	}
}
