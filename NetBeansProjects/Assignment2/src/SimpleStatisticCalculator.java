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
public class SimpleStatisticCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //input
        System.out.print("Please input 5 numbers separated by space: ");
        String nums = console.nextLine();
        //process
        /* here I divided string of 5 numbers into separate numbers 
                using different variables */
        String num1 = nums.substring(0,1);
        String num2 = nums.substring(2,3);
        String num3 = nums.substring(4,5);
        String num4 = nums.substring(6,7);
        String num5 = nums.substring(8,9);
        // here I converted every number into an integer 
        double num01 = Integer.parseInt(num1);
        double num02 = Integer.parseInt(num2);
        double num03 = Integer.parseInt(num3);
        double num04 = Integer.parseInt(num4);
        double num05 = Integer.parseInt(num5);
        // the calculation
        double mean = (num01 + num02 + num03 + num04 + num05) / 5;
        double min = Math.min(Math.min(num01, num02), 
                Math.min(Math.min(num03,num04) ,num05));
        double max = Math.max(Math.max(num01, num02), 
                Math.max(Math.max(num03,num04) ,num05));
        double SD = Math.sqrt((Math.pow(Math.abs(num01-mean), 2) + 
                Math.pow(Math.abs(num02-mean), 2) + 
                Math.pow(Math.abs(num03-mean), 2) +
                Math.pow(Math.abs(num04-mean), 2) +
                Math.pow(Math.abs(num05-mean), 2)) / 5);   
        //output
        System.out.printf("%-25s: %.2f, %.2f, %.2f, %.2f, %.2f\n",
                "Numbers", num01, num02, num03, num04, num05); 
        System.out.printf("%-25s: %.2f\n", "Mean", mean);
        System.out.printf("%-25s: %.2f\n", "Minimum", min);
        System.out.printf("%-25s: %.2f\n", "Maximum", max);
        System.out.printf("%-25s: %.2f\n", "Standard Deviation", SD); 
    }
}
