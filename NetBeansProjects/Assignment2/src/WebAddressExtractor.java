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
public class WebAddressExtractor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //input
        System.out.println("Please input a web address: ");
        String webAddress = console.nextLine();
        //to lower case 
        String webAddressLow = webAddress.toLowerCase();
        //split 
        String heading = webAddressLow.substring(0, webAddressLow.indexOf('.'));
        String company = webAddressLow.substring(webAddressLow.indexOf('.') 
                + 1, webAddressLow.lastIndexOf('.'));
        String extension = webAddressLow.substring(webAddressLow.lastIndexOf('.')
                + 1);
        //output
        System.out.printf("%-13s: %s\n", "Address", webAddressLow);
        System.out.printf("%-13s: %s\n", "Heading", heading);
        System.out.printf("%-13s: %s\n", "Company", company);
        System.out.printf("%-13s: %s\n", "Extension", extension);
    }
}
