

import java.util.Scanner;

public class Cylinder {
	public static void main(String args[])
	{
		final float PI =3.142f;
		float radius, height,volume;
		
		Scanner input=new Scanner(System.in);
		
	System.out.print("Please enter the raduis of the cylinder: ");
		radius=input.nextFloat();
		
	System.out.print("Please enter the height of the cylinder: ");
		height=input.nextFloat();
		
		volume =height*radius*radius*PI;
		
		System.out.println("\n\n\t\t+++++++++++++++++++++++++++"+
 		"\n\t\t\t\tCalculation Result\n\t\t+++++++++++++++++++++++++++\n\n");
 		
 		System.out.print("\nVoulume of cylinder is "+
 			String.format("%.2f",volume));
 		
	}
	
}