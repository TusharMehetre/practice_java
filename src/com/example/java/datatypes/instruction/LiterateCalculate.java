package com.example.java.datatypes.instruction;

public class LiterateCalculate {

	public static void main(String[] args) {
		int totalPopulation = 80000;
		double menPercentage = 52;
		double totalLiteracyPercentage = 48;
		double literateMenPercentage = 35;
		
		//calculate number of men and women 
		int totalMen = (int)(totalPopulation*menPercentage/100);
		int totalWomen = totalPopulation - totalMen;
		
		//calculate total literate people 
		int totalLiterate = (int)(totalPopulation * totalLiteracyPercentage/100);
		
		//calculate total literate men 
		int literateMen = (int)(totalPopulation * literateMenPercentage /100);
		
		//calculate total literate women 
		int literateWomen = totalLiterate - literateMen;
		
		//calculate illiterate men and women 
		int illitrateMen = totalMen - literateMen;
		int illitrateWomen = totalWomen - literateWomen;
		
		System.out.println("Total number of illitrate men: "+ illitrateMen);
		System.out.println("Total number of illitrate women: "+ illitrateWomen);
		System.out.println("Total illitrate men and women: "+ (illitrateMen+illitrateWomen));
	}

}
