package com.example.gettingsterted;

public class TempratureConverter {

	public static void main(String[] args) {
		double fahrenheit = 98.4; //assume temprature in fahrenheit
		double centigrade = (5.0/9) * (fahrenheit-32);
		
		System.out.println("Temprature in fahrenheit: " + fahrenheit);
		System.out.println("Temprature in Centigrade: " + centigrade);
		
	}

}
