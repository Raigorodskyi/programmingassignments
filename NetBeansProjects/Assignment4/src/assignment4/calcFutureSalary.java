/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Igor Raigorodskyi
 */
public class calcFutureSalary {
    public static void main(String[] args) {
        //System.out.printf("%.2f\n",calcFutureSalary(2000, 40));
    }
    /**
     * 
     * @param curretSalary indicates the present salary of an employee 
     * @param year indicates the number of years after which we want to 
     * calculate the future salary 
     * @return the salary after the amount of years
     */
    public static double calcFutureSalary(double curretSalary, int year){
        if (year<3) {
            return Math.pow(1.03, year)*curretSalary;
        }
        if (year==3 && year<10){
            return Math.pow(1.05, year-3) * Math.pow(1.03, year)*curretSalary;
        }
        if (year>=10){
            return (Math.pow(1.05, year-3) * Math.pow(1.03, year)*curretSalary) 
                    * Math.pow(1.1, year-10);
        }
    return Math.pow(1.03, year)*curretSalary;
    
    }
}
