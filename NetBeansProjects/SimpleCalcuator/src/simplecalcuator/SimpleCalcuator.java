/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalcuator;
import java.util.Scanner;
/**
 *
 * @author Igor Raigorodskyi
 */
public class SimpleCalcuator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // asking the user for input first method
        System.out.print("Please enter two numbers, separated by space: ");
        String numsBySpace = console.nextLine();
        //separating the numbers into two strings
        String firstNumS = numsBySpace.substring(0, numsBySpace.indexOf(" "));
        String secNumS = numsBySpace.substring(numsBySpace.indexOf(" "));
        //converting the two strings to double
        double firstNumD = Double.parseDouble(firstNumS);
        double secNumD = Double.parseDouble(secNumS);
        //calling the method
        double result1 = calcResult(firstNumD, secNumD);
        
        // asking for input second method
        System.out.print("Please enter the operator: ");
        String operator = console.nextLine();
        char oper = operator.charAt(0);
        //calling the method
        double result2 = calcResult(firstNumD, secNumD, oper);
        
        //asking for input third method
        System.out.print("Please, enter a formular, e.g.: " +
                "3.14 + 2: ");
        String formul = console.nextLine();
        //pasting some piece of code from the third method to have the 
                //same doubles for printing the result
        String fNumString = formul.substring(0, formul.indexOf(" "));
        String operString = formul.substring(formul.indexOf(" "), 
                formul.lastIndexOf(" "));
        String sNumString = formul.substring(formul.lastIndexOf(" "));
        double fNumDouble = Double.parseDouble(fNumString);
        double sNumDouble = Double.parseDouble(sNumString);
        char operat = operString.charAt(1);
        String formula = fNumDouble + " " + operat + " "  + sNumDouble;
        //calling the method
        double result3 = calcResult(formula);
        
        //printing the result
        System.out.printf("%-25s: %s %s %s %s %.2f\n", "Calling the first method", 
                firstNumD, "+", secNumD, "=", result1);
        System.out.printf("%-25s: %s %s %s %s %.2f\n", "Calling the second method", 
                firstNumD, oper, secNumD, "=",result2);
        System.out.printf("%-25s: %s %s %.2f\n", "Calling the third method", 
                formula, "=", result3);
    }
    //methods
    public static double calcResult(double num1, double num2){
        return num1 + num2;
    }
    public static double  calcResult(double num1, double num2, char oper){
        switch(oper){
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            case '-':
                return num1-num2;
            case '+':
                return num1+num2;}
        return num1+num2;
    }
    public static double calcResult(String formula){
        String fNumString = formula.substring(0, formula.indexOf(" "));
        String operString = formula.substring(formula.indexOf(" "), 
                formula.lastIndexOf(" "));
        String sNumString = formula.substring(formula.lastIndexOf(" "));
        double fNumDouble = Double.parseDouble(fNumString);
        double sNumDouble = Double.parseDouble(sNumString);
        char operat = operString.charAt(1);
        switch (operat){
            case '*':
                return fNumDouble * sNumDouble;
            case '/':
                return fNumDouble / sNumDouble;
            case '-':
                return fNumDouble - sNumDouble;
            case '+':
                return fNumDouble + sNumDouble;}
        return fNumDouble + sNumDouble;
    }
    
    
}
