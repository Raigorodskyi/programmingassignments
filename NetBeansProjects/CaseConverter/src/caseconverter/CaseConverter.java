/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseconverter;
import java.util.Scanner;
/**
 *
 * @author Igor Raigorodskyi
 */
public class CaseConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        /*asking for input and making the strings and chars ready to 
                call the methods*/
        System.out.print("Please enter a word: ");
        String word = console.nextLine();
        System.out.println("Please choose the case you want to convert\n"
                + "1. 'l' or 'L' for lowercase\n" + 
                "2. 'u' or 'U' for uppercase\n" +
                "3. 't' or 'T' for titlecase\n");
        String strConvert = console.nextLine().toLowerCase();
        char caseType = strConvert.charAt(0);
        
        //calling the metods and printing the results
        System.out.printf("%-38s: %s\n", "Original word", word);
        System.out.printf("%-38s: %s\n", "Calling the first converCase method",
                convertCase(word));
        System.out.printf("%-38s: %s\n", "Calling the second convert case method",
                convertCase(word, caseType));
    }
    
    //first method
    public static String convertCase(String word){
        String wLower = word.substring(1).toLowerCase();
        String wFirLet = word.substring(0,1).toUpperCase();
        String titlCase = wFirLet + wLower;
        return titlCase;}
    //second method
    public static String convertCase(String word, char caseType){
        switch(caseType){
            case 'u':
                return word.toUpperCase();
            case 'l':
                return word.toLowerCase();
            default:
                return convertCase(word);}
    } 
}
