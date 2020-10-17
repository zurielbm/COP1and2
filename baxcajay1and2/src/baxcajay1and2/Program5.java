package baxcajay1and2;
import java.util.Scanner; 

//SPC ID: 2381832

public class Program5 {
	
	public static void main(String[] args) {
		
		// Gets the input of the first integer
		Scanner inputNumberOne = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int firstNumber = inputNumberOne.nextInt();
		
		// Get the input of the second integer
		Scanner inputNumberTwo = new Scanner(System.in);
		System.out.println("Enter a second integer: ");
		int secondNumber = inputNumberTwo.nextInt();
		
		// Computes the quotient
		int quotient = firstNumber / secondNumber;
		
		// Displays the results 
		System.out.println(quotient);
		
	}

}
