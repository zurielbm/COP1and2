package baxcajay1and2;
import java.util.Scanner; 

//SPC ID: 2381832

public class Program2 {
	public static void main(String[] args) {
		Scanner inputPrice = new Scanner(System.in); 
		System.out.println("input unit price:");
		int price = inputPrice.nextInt();
		
		
		Scanner inputQuantity = new Scanner(System.in); 
		System.out.println("input a Quantity:");
		int quantity = inputQuantity.nextInt();
		
		int subtotal = price * quantity;
		
		System.out.println("subtotal: $" + subtotal);
		
		
	}

}
