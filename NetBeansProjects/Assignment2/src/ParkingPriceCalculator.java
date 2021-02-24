/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Igor Raigorodskyi
 */
public class ParkingPriceCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //input 
        System.out.println("Please enter the number of minutes your car has "
                + "parked: ");
        double min = console.nextInt();
        //process
        double hours = Math.ceil(min / 60);
        double price = hours * 2;
        //output
        System.out.printf("%-25s: %.0f\n", "Parking time (minutes)", min);
        System.out.printf("%-25s: %.0f\n", "Parking time (hour)", hours);
        System.out.printf("%-25s: %.2f\n", "Price", price); 
        
    }
}
