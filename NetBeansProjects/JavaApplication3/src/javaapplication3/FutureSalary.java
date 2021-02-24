/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 2003i
 */
public class FutureSalary {
    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
            System.out.println("What is your initial salary?");
            double initialSalary = consol.nextDouble();
        Scanner conso = new Scanner(System.in);
            System.out.println("What is the increase ratio?(in %)");
            double increaseRatio = consol.nextDouble();
        Scanner cons = new Scanner(System.in);
            System.out.print("After how many years you want to check the salary?");
            double numOfYears = consol.nextDouble();
        double finalSalary = (initialSalary+ increaseRatio/100*numOfYears*initialSalary);
        System.out.printf("%-20s %5f\n", "Initial salary: ", initialSalary);
        System.out.printf("%-20s %5f\n", "Increase ratio: ", increaseRatio);
        System.out.printf("%-20s %5f\n", "After X years: ", numOfYears);
        System.out.println("____________________");
        System.out.printf("%-20s %5f\n", "Salary after 6 years: ", finalSalary);
    }
    
}
