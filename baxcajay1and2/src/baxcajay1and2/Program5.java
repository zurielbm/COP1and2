package baxcajay1and2;
import java.util.Scanner; 

//SPC ID: 2381832

public class Program5 {
	public static void main(String[] args) {
		Scanner inputNumberOne = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int firstNumber = inputNumberOne.nextInt();
		
		Scanner inputNumberTwo = new Scanner(System.in);
		System.out.println("Enter a second integer: ");
		int secondNumber = inputNumberTwo.nextInt();
		
		System.out.println(firstNumber / secondNumber);
		
	}

}
