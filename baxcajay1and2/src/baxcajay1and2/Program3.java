package baxcajay1and2;
import java.util.Scanner; 

//SPC ID: 2381832

public class Program3 {
	
	public static void main(String[] args){
		Scanner inputFahrenheit = new Scanner(System.in);
		System.out.println("Input a temperature in Fahrenheit: ");
		float fahrenheit = inputFahrenheit.nextFloat();
		
		
		float celsius = (fahrenheit - 32f)*(5f/9f);
		
		System.out.println(celsius + " celsius");
		
	}

}
