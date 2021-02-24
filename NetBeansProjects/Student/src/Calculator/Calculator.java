/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;
import java.util.Scanner;
/**
 *
 * @author 2003i
 */
public class Calculator {
    private double num1;
    private double num2;
    private char oper;
    
    public Calculator(){
        this.num1 = Double.NaN;
        this.num2 = Double.NaN;
        this.oper = 0;
    }
    
    public Calculator(double num1, double num2, char oper){
        this.num1 = num1;
        this.num2 = num2;
        this.oper = oper;
    }
    
    public Calculator(Calculator calculator){
        this.num1 = calculator.num1;
        this.num2 = calculator.num2;
        this.oper = calculator.oper;
    }
    
    public void inputNum1(){
        Scanner console = new Scanner(System.in);
        System.out.print("Please, enter the first number: ");
        num1 = console.nextDouble();
    }
    
    public void inputNum2(){
        Scanner console = new Scanner(System.in);
        System.out.print("Please, enter the second number: ");
        num2 = console.nextDouble();
    }
    
    public void inputOperator(){
        String validOpr = "+-*/%";
        Scanner console = new Scanner(System.in);
        char oper;
        do {       
            System.out.print("Please, enter the second number: ");
            oper = console.nextLine().charAt(0);
        } 
        while (!validOpr.contains("" + oper));
        
        this.oper = oper;
    }
    
    public double calcResult(){
        switch(oper){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return num1 % num2;
        }
    }
    
    public boolean equals(Calculator calculator){
        return num1 == calculator.num1&& 
                num2 == calculator.num2&&
                    oper == calculator.oper;
    }
    
    @Override
    public String toString(){
        return String.format("%.2f %c %.2f = %.2f", num1, oper, num2, calcResult());
    }
}
    
