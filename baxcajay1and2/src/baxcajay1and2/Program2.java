package baxcajay1and2;
import java.util.Scanner; 

//SPC ID: 2381832

public class Program2 {
	
	public static void main(String[] args) {
		
		// Gets input for price
		Scanner inputPrice = new Scanner(System.in); 
		System.out.println("input unit price:");
		int price = inputPrice.nextInt();
		
		// Gets input of quantity
		Scanner inputQuantity = new Scanner(System.in); 
		System.out.println("input a Quantity:");
		int quantity = inputQuantity.nextInt();
		
		// Computes the subtotal
		int subtotal = price * quantity;
		
		// Displays the results 
		System.out.println("subtotal: $" + subtotal);
		
		
	}

}
