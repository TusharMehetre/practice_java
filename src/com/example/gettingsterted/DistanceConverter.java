package com.example.gettingsterted;

public class DistanceConverter {

	public static void main(String[] args) {
		double distanceInKm = 10; //Assume distance in km
		double distanceInMeters = distanceInKm * 1000;//convert distance in meters 
		double distanceInCm = distanceInKm * 100000; //convert distance in centimeters 
		double distanceInInches = distanceInKm * 39370.1; //convert distance in inches
		
		System.out.println("Distance in Kelometers: " + distanceInKm);
		System.out.println("Distance in Meters: " + distanceInMeters);
		System.out.println("Distance in Centimeters: " + distanceInCm);
		System.out.println("Distance in Inches: " + distanceInInches);	
	}

}
