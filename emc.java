//---------------------------------------//
//-- Created by:     Alireza Teimoori  --//
//-- Created on:     Feb 8 2019        --//
//-- Created for:    Unit 1-03         --//
//-- Course Code:    ICS4U             --//
//-- Teacher Name:   Chris Atkinson    --//
//---------------------------------------//

import java.util.*;

public class emc2 {
	
	// Intro LightSpeed:
	private static float LightSpeed = (float) (2.998 * Math.pow(10,8));
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		// Asking for "mass":
		System.out.println("Please the enter the mass of your object in kg: ");
		
		// Storing "mass":
		float mass = userInput.nextFloat();
		
		userInput.close();
		
		// Calculations:
		float energy = (float) (mass * Math.pow(LightSpeed, 2));
		
		// Output:
		System.out.println("If " + mass + " kg was converted into energy, " + energy + " joules would be produced.");
		
	}

}