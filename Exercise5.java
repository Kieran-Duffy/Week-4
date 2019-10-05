//Exercise5.java
/*This program determines the force exerted on one object by another*/

import java.util.Scanner;

public class Exercise5{
	public static void main(String args[])
	{
	
	
	final float GRAVITATIONAL=6.67300E-11f;
	
	float firstMass, secondMass; 
		
	int distance;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter the mass in kg of the first object: ");
	firstMass=input.nextFloat();
	
	System.out.print("Please enter the mass in kg of the second object: ");
	secondMass=input.nextFloat();
	
	System.out.print("Please enter the distance in meteres between the objects: ");
	distance=input.nextInt();
	
	
	
	System.out.println("\n*******Results of Program*******"+"\n\nThe mass of the first object is "+firstMass+"KG"+"\nThe mass of the second object is "+secondMass+"KG"+
		"\nThe distance between the two objects is "+distance+"M"+"\nThe force exerted on the objects is "+
			String.format("%.2f",(GRAVITATIONAL*firstMass*secondMass)/(distance*distance))+"N");
	
	}	
}


