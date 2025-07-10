package com.example.string.and.enums.classes.object;

import java.util.Scanner;

public class AbbreviateNames {
	private String fullName;
	
	public AbbreviateNames(String fullName)
	{
        this.fullName = fullName;
    }
	
	public String getAbbreviatedName() 
	{
        String[] parts = fullName.split("\\s+");
        int n = parts.length;

        if (n == 1) 
        {
            return parts[0];
        } 
        else 
        {
            StringBuilder abbreviated = new StringBuilder();
            for (int i = 0; i < n - 1; i++) 
            {
                abbreviated.append(parts[i].charAt(0)).append(". ");
            }
            abbreviated.append(parts[n - 1]);
            return abbreviated.toString();
        }
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the full name: ");
        String nameInput = scan.nextLine();

        AbbreviateNames abbreviate = new AbbreviateNames(nameInput);

        String result = abbreviate.getAbbreviatedName();
        System.out.println("Abbreviated Name: " + result);
    }
}
