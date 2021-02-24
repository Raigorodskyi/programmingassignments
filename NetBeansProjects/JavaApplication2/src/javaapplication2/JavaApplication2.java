/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 2003i
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 1642;
        System.out.println(year/100+1);
        System.out.println(year % 100 / 10 * 10);
         //TODO code application logic here
        double price = 99.99;
        price *= 0.8;
        System.out.println(price);
        
        int num = 10;
        int num2 = 3 + num++;
        System.out.println(num2);
    }
    
public static void mai(String[] argss) {
        //System.out.println(1986/100+1);
        //System.out.println(10 * 1986 % 100 / 10);
        Scanner console = new Scanner(System.in); //memorize
        //3 methods for input
            //input an int
            System.out.print("Please enter a number: ");
            double num = console.nextInt();
            //input a double
            //input a string
        
    }
        
    }
    
    /**
     *
     * @param arg 
     */
    /**public static void main(String[] args) {
        double num3=3.14;
        System.out.println(num3);
        System.out.println();
        
    }

    private static class Str {

        public Str() {
            
        }
    }*/
    

