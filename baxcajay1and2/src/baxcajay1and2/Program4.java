package baxcajay1and2;
import java.util.Scanner; 

//SPC ID: 2381832

public class Program4 {
	
	public static void main(String[] args) {
		
		// Gets input for the radius of a circle
		Scanner inputRadius = new Scanner(System.in);
		System.out.print("Enter a radius of a circle to find the area and circumference: ");
		
		double radius = inputRadius.nextDouble();
		
		// number of pi
		final double pi = 3.14159;
		
		// Computes the area of a circle
		double areaOfCircle = pi * (Math.pow(radius, 2));
		
		// Computes the circumference of a circle
		double circumferenceOfCircle = 2 * pi * radius;
		
		// Displays the results
		System.out.println("The area of the circle is " + areaOfCircle);
		
		System.out.println("The circumference of the circle is " + circumferenceOfCircle);
		
	} 

}
