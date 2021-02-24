/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Igor Raigorodskyi
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    /**
     * 
     * @param num is the number of letters from alphabet to be printed
     * @param caseType the case type of these letters to be printed
     * @return the letters of alphabet in a case asked by the user
     */
    public static String generateAlphabetString(int num, char caseType){
        String alphab = "";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if (num <= 0) {
            return "";
        }
        for (int i = 1; i < num + 1 ; i++) {
            if (i==27) {
                i=1;
                num-=26;
            }
            alphab+=alphabet[i-1];
        }
        switch(caseType){
            case 'u':
            case 'U':
                return alphab.toUpperCase();
            default:
                return alphab;
        }
    }
    /**
     * 
     * @param str the string that would have hidden characters
     * @param idx the index of a character that would not be hidden
     * @return the string of hidden characters with an '-' except for the char at idx
     */
    public static String hideCharacter(String str, int idx){
        String newStr = "";
        if(idx<0 || idx>str.length() - 1){
            return str;
        }
        for (int i = 0; i < str.length() ; i++) {
            if (idx != i) {
                newStr += '-';
            }
            else{
                newStr+= str.charAt(i);}
        }
        return newStr;
    }
    /**
     * 
     * @param str the string to be inspected if it has a character
     * @param c the character that we are looking for in a string
     * @return true or false
     */
    public static boolean containsIgnoreCase(String str, char c){
        if (Character.isLetter(c) == true) {
            for (int i = 0; i < str.length(); i++) {
                String charAtI = str.charAt(i) + "";
                String charC = c + "";
                if (charAtI.toUpperCase().equals(charC) || charAtI.toLowerCase().equals(charC)) {
                    return true;
                }
            }
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                String charAtI = str.charAt(i) + "";
                String charC = c + "";
                if (charAtI.equals(charC)) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 
     * @param strIn the string to be encoded 
     * @param delta the number of letters in the alphabet that we are going to switch them
     * @return 
     */
    public static String encode(String strIn, int delta){
        String newString = "";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        if(strIn.equals("")){
            return "";
        }
        for (int i = 0; i < strIn.length() ; i++) {
            char c = strIn.charAt(i);
            if (Character.isUpperCase(c) == true) {
                for (int j = 0; j <= alphabetUp.length - 1; j++) {
                    if (c == alphabetUp[j]) {
                        if (j + delta < 0 || j + delta > 25) {
                            if (j + delta < 0) {
                                newString += alphabetUp[j + delta + 26];
                            }
                            if (j + delta > 25) {
                                newString += alphabetUp[j + delta - 26];
                            }
                        }
                        else{
                            newString += alphabetUp[j + delta];
                        }
                    }
                }
            }
            if (Character.isLowerCase(c) == true) {
                for (int j = 0; j <= alphabet.length - 1; j++) {
                    if (c == alphabet[j]) {
                        if (j + delta < 0 || j + delta > 25) {
                            if (j + delta < 0) {
                                newString += alphabet[j + delta + 26];
                            }
                            if (j + delta > 25) {
                                newString += alphabet[j + delta - 26];
                            }
                        }
                        else{
                            newString += alphabet[j + delta];
                        }
                    }   
                }
            }
            if (Character.isLetter(c) != true) {
                newString += c;
            }
        }
        return newString;
    }
}
