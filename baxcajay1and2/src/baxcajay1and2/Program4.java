package baxcajay1and2;
import java.util.Scanner; 

//SPC ID: 2381832

public class Program4 {
	
	public static void main(String[] args) {
		
		Scanner inputRadius = new Scanner(System.in);
		System.out.print("Enter a radius of a circle to find the area and circumference: ");
		
		double radius = inputRadius.nextDouble();
		
		final double pi = 3.14159;
		
		double areaOfCircle = pi * (Math.pow(radius, 2));
		
		double circumferenceOfCircle = 2 * pi * radius;
		
		System.out.println("The area of the circle is " + areaOfCircle);
		
		System.out.println("The circumference of the circle is " + circumferenceOfCircle);
		
	} 

}
