/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentprogramming1;
import java.util.Scanner;
/**
 *
 * @author 2003i
 */
class console {
    public static void main(String[] args) {
        //System.out.printf("%.2f",getSalary(50000, 7));
        //System.out.printf("%.2f\n",calcFinalPrice(5, false));
        System.out.println(calcResult(23, 44, '-'));
       /* System.out.println(min(1223, 3565, 12345));
        System.out.println(2 | 1); */
       //int num = 121;
        //System.out.println(isEven(num));
        //System.out.println(calcLetterSchore(85));
        System.out.println(fakeATM(8000));
    }
   /* public static double max(double num1, double num2, double num3) {
        return Math.max(Math.max(num3, num2), num1);
        } 
    public static double min(double num1, double num2, double num3) {
        return Math.min(Math.min(num3, num2), num1);
        } 
    public static double median(double num1, double num2, double num3) {
        return num1 + num2 + num3 - min(num1, num2, num3) - max(num1, num2, num3); }
    */
    /*public static boolean isEven(int num){
        return num%2 ==0;*/
        /*if (num%2 == 0){
            return true;}
        return false;*/
        
   // }
    /*public static char calcLetterSchore(double digitScore){
        if (digitScore>= 90){
            return 'A';}
        else if (digitScore>=80){
            return 'B';}
        else if (digitScore>=70){
            return 'C';}
        else if (digitScore>=60){
            return 'D';}
        else {
            return 'F';}
}*/  
    public static String getTitle(char gender, int age){
       /* if (gender == 'M' && age<18) {
            return "boy";}
        if (gender == 'F' && age<18) {
            return "girl";}
        if (gender == 'M' && age>=18){
            return "man";}
        else
        {   return "woman";}*/
        if (gender == 'F')
            return age<18 ? "girl" : "woman";
        else
            return age<18 ? "boy" : "man";
    }
    public static double getSalary(double initSalary, int year) {
        double Salarybefore5 = initSalary*Math.pow(1+0.02,year);
        double Salaryat5 = initSalary*Math.pow(1+0.02, 5);
        if (year<5)
            return Salarybefore5;
        else
            return Salaryat5*Math.pow(1+0.05, year-5);
    }
    public static double calcFinalPrice(int numChan, boolean VIP) {
        int price;
        if (numChan<=5 && VIP == true){
            return numChan * 10 * 0.85;}
        if (numChan>=5 && numChan<=10 && VIP == true){
            return 50 + (numChan-5) * 6 * 0.85;}
        if (numChan>10 && VIP == true){
            return 80 + (numChan-10) * 2 *0.85;}
        if (numChan<=5 && VIP == false){
            return numChan * 10;}
        if (numChan>=5 && numChan<=10 && VIP == false){
            return 50 + (numChan - 5) * 6;} 
        else
            {return 80 + ((numChan - 10) * 2);}
    }
    public static double calcResult(double num1, double num2, char oper){
        switch (oper){
            case '+':
                return num1 + num2;
            case '-':
                return (num1<num2) ? num2-num1 : num1-num2;
            case '*':
            case 'x':
            case 'X':
                return num1 * num2;
            default:
                return num1 / num2;}
    
    }
    public static String fakeATM( /*int oper,*/ double balance){
        Scanner console = new Scanner(System.in);
        System.out.println("What operation do you want to have(1,2,3)?\n"
                + "1. withdraw\n" + "2. deposit\n" + "3. display banance\n");
        int oper = console.nextInt();
        switch(oper){
            case 1:
                System.out.println("What amount of money you wany to withdraw?");
                double amouWithd = console.nextDouble();
                if (amouWithd>balance)
                    return "Withdraw failed. You want to withdraw " + amouWithd +
                            ", but you only have " + balance + ".";
                else
                    return "Withdraw success. Your current balance is " + 
                            (balance - amouWithd) + ".";
            case 2:
                System.out.println("How much money do you deposit?");
                double amouDepo = console.nextDouble();
                return "Deposit success. Your current balance is " + (balance +amouDepo)+
                        ".";
            default:
                return "Your current balance is " + balance+ ".";}

    }

}