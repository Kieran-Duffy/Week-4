//Exercise4.java
/*Distance Calulator*/

import java.util.Scanner;

public class Exercise4{
	public static void main(String args[])
	{
	
		
	float speed, time, acceleration, distance;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("**********Distance Calculator**********\n");
	
	System.out.print("Please enter the initial speed: ");
	speed=input.nextFloat();
	
	System.out.print("Please enter the acceleration: ");
	acceleration=input.nextFloat();
	
	System.out.print("PLease enter the time spent traveling: ");
	time=input.nextFloat();
	
	System.out.println("\nThe object traveled a distance of "+
		String.format("%.2f",speed*time+(acceleration*time*time)/2)+" meters");
	
	}
		
	
}