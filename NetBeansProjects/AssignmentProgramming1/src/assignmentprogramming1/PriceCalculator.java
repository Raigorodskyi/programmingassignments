/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentprogramming1;
import java.util.Scanner;

/**
 *
 * @author Igor Raigorodskyi
 */
public class PriceCalculator {
    public static void main(String[] args) {
    
        //input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter the item price: ");
        double price = console.nextDouble();
        System.out.print("Please enter the discount ratio (5 for 5% off): ");
        double disc = console.nextDouble();
        
        //calculation
        double discDeci = price * (disc / 100);
        double discPrice = price - discDeci;
        double fedPerc = 0.05;
        double provPerc = 0.09975;
        double fedTax = discPrice * fedPerc;
        double provTax = discPrice * provPerc;
        double totalPrice = discPrice + fedTax +provTax;
        
        //output
        System.out.printf("%-23s: %3.2f\n", "Initial Price", price);
        System.out.printf("%-23s: %3.2f\n", "Discount", disc);
        System.out.printf("%-23s: %3.2f\n", "Price before taxes", discPrice);
        System.out.println("----------------------------------------");
        System.out.printf("%-23s: %3.2f\n", "Federal Taxes", fedTax);
        System.out.printf("%-23s: %3.2f\n", "Provincial Taxes", provTax);
        System.out.printf("%-23s: %3.2f\n", "Total Price", totalPrice);
    }
    
    
}
