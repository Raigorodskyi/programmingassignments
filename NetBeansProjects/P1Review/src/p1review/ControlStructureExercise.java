/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1review;

/**
 *
 * @author 2003i
 */
public class ControlStructureExercise {
    
    public static void main(String[] args) {
        System.out.println(isPrime(111));
    }
    
    public int calcDigits(String pizda) {
        int numOfDigit = 0;
        for (int i = 0; i < pizda.length(); i++) {
            if (Character.isDigit(pizda.charAt(i))) {
                numOfDigit++;
            }
        }
        return numOfDigit;
    }
    
    public static String switchCase(String str) {
        String switched = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) == false) {
                switched += str.charAt(i);
            }
            /*if (Character.isLetter(str.charAt(i)))*/else {
                if (Character.isUpperCase(str.charAt(i))) {
                    switched += Character.toLowerCase(str.charAt(i));
                }
                else {
                    switched += Character.toUpperCase(str.charAt(i));
                }
            }
        }
        return switched;
    }
    
    public static boolean isPrime(int num) {
        int divis = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divis++;
            }
        }
        return divis == 2;
    }
}
