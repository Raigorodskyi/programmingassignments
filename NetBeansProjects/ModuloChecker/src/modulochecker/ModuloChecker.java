/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulochecker;
import java.util.Scanner;
/**
 *
 * @author Igor Raigorodskyi
 */
public class ModuloChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //asking for input (2 numbers)
        System.out.print("Please enter a number and a base, separated by space: ");
        String numbsBySpace = console.nextLine();
        String firNum = numbsBySpace.substring(0, numbsBySpace.indexOf(" "));
        String secNum = numbsBySpace.substring(numbsBySpace.indexOf(" ")+1);
        int fNum = Integer.parseInt(firNum);
        int sNum = Integer.parseInt(secNum);
        if(isDivisible(fNum, sNum)==true){
            System.out.println(firNum + " is divisible by " + secNum);}
        else {
            System.out.println(firNum + " is not divisible by " + secNum);}
            
        //asking for input (English letter)
        System.out.println("Please enter and English letter: ");
        String engLett = console.nextLine();
        char engLetter = engLett.charAt(0);
        //int engLettre = letterToNumber(engLetter);
        //asking for input (number base and English letter base)
        System.out.println("Please enter a number base and an English letter "
                + "base, separated by space: ");
        String numAndLet = console.nextLine();
        int numBase = Integer.parseInt(numAndLet.substring(0,
                numAndLet.indexOf(" ")));
        char lettBase = numAndLet.substring(numAndLet.indexOf(" ")).charAt(1);
        //output for char%num and char%char
        if(isDivisible(engLetter, numBase) == true){
            System.out.println(engLetter + " is divisible by " + numBase);}
        else
            {System.out.println(engLetter + " is not divisible by " + numBase);}
        if(isDivisible(engLetter, lettBase) == true){
            System.out.println(engLetter + " is divisible by " + lettBase);}
        else{
            System.out.println(engLetter + " is not divisible by " + lettBase);}
    }
    public static int letterToNumber(char c){
        int ascii = c;
        boolean isUpp = Character.isUpperCase(c);
        if(isUpp == true){
            ascii -=65;} //as 'A' in ascii is 65, we would substract 65 to get 0
        else{
            ascii -=97;} //as 'a' in ascii is 65, we would substract 97 to get 0
        return ascii;
    }
    public static boolean isDivisible(int num){
        return num % 3 == 0;
    }
    public static boolean isDivisible(int num, int base){
        return num % base == 0;
    }
    public static boolean isDivisible(char letter){
        return letterToNumber(letter) % 3==0;
            }
    public static boolean isDivisible(char letter, int base){
        return letterToNumber(letter) % 3 ==0;
                }
    public static boolean isDivisible(char letter, char base){
        return letterToNumber(letter) % letterToNumber(base) == 0;
    }
    
}
