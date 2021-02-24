/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop.exersices;
import java.util.Random;
import javafx.beans.binding.Bindings;

/**
 *
 * @author 2003i
 */
public class LoopExersices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*for the loop, need 3 parts, usually
            1.initialization
            2.condition
            3.update*/
        /*int age = 15;
        
        while (age<18)          // loop
            {System.out.println("You are not an adult");
            age++;}
        System.out.println("Finish");*/
        System.out.println(toTitleCase(""));
        }
    
    
    public static String toTitleCase(String str) {
        Random rand = new Random();
         int num = rand.nextInt(10000);
        String strToTitle = String.format("%04d", num);
        for (int i = 0; i < str.length(); i++) {
            String currentChar = str.charAt(i) + "";
           // String nextChar = str.charAt(i + 1) + "";
            if (i == 0) {
                strToTitle += currentChar.toUpperCase();
            }
            else if (str.charAt(i - 1) == ' ') {
                strToTitle += currentChar.toUpperCase();
            }
            else {
                strToTitle += currentChar.toLowerCase();
            }
        }
        return strToTitle;
    }
    
   /* public static int countDigit(String str){
        int count = 0;
        int checPos = 0;
        while (checPos< str.length())
            if (Character.isDigit(str.charAt(checPos)))
                count++;
        return count; 
    }
    public static int sumRange(int num1, int num2){
        int sum = 0;
        int num = Math.min(num1, num2);
        while (num<=Math.max(num1, num2)){
            sum += num;
            num++;}
        return sum;
    }
    public static String reverseString(String str){
        String strRev = "";
        for(int i = str.length()-1;i>=0;i--){
            strRev += str.charAt(i);
       }
         return strRev;
    }
    public static String removeDigits(String str){
        String newStr = "";
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)==false){
            newStr+= c;}
        }
        return newStr;}
    
    public static boolean isPrime(int num){
        if(num<=1){
            return false;}
        for(int i = 2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean containsVowel(String str){
        for(int i = 0; i<str.length(); i++){
            char c = Character.toLowerCase(str.charAt(i));
            switch (c){
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                case 'y':
                    return true;
            }
        }
        return false;
    }
    public static String strConsonant(String str){
        String cons = "";
        for(int i = 0; i<str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) != 'a' && 
                    Character.toLowerCase(str.charAt(i)) !='o' && 
                    Character.toLowerCase(str.charAt(i)) !='e' &&
                    Character.toLowerCase(str.charAt(i)) != 'i' && 
                    Character.toLowerCase(str.charAt(i)) !='u' && 
                    Character.toLowerCase(str.charAt(i)) !='y'){
                cons+= str.charAt(i);}
        }
        return cons;
    }
    public static String reverseString1(String str){
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
    public static int reverseNum1(int num){
        return Integer.parseInt(reverseString1("" + num));
    }
    public static int reverseNum2(int num){
        int num2 = 0;
        
        while(num!=0){
            int lastDigit = num % 10;
            num2 = num2 * 10 +lastDigit;
            num/=10;
        }
        return num2;
    }
    public static double add(double num1, double num2){
        return num1 + num2;}
    public static double substract(double num1, double num2){
        return num1 - num2;}
    public static double divide(double num1, double num2){
        return num1 / num2;}
    public static double multiply(double num1, double num2){
        return num1 * num2;}
    public static double calcResult(double num1, double num2, char oper){
        switch(oper){
            case '+':
                return add(num1, num2);
            case '-':
                return substract(num1, num2);
            case '*':
            case 'X':
            case 'x':
                return multiply(num1, num2);
            default:
                return divide(num1, num2);
        }
    }
    
    public static boolean isOperValid(char oper){
        return oper == '/' || oper == '*' || oper == '+' || oper == '*' ||
                oper == 'x' || oper == 'X';
    }
    public static String removeVowel (String str){
        /*String newString = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' &&
                    str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='y' &&
                    str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' &&
                    str.charAt(i)!='O' && str.charAt(i)!='U' && str.charAt(i)!='Y') {
                newString+=str.charAt(i);
            }
        }
        return newString; *//*
        return str.replaceAll("[AaEeIiOoUuYy]", "");
    }
    public static void printNoThreeGame(int num){
        for(int i = 0; i <= num; i++){
            String number = Integer.toString(i);
            if(num == 0 && number.contains("3"))
                continue;
            System.out.println(i);
        }
    }
    public static void printNum(int bound, int quitNum){
        Random rand = new Random();
        while(true) {
            int num = rand.nextInt(bound);
            if (num == quitNum)
                break;
            System.err.println(num + "");
        }
    }
    public static boolean isPalindrome(String str){
        if(str == null){
            return false;}
        return reverseString(str.toLowerCase()).equals(str.toLowerCase());
    }*/
   /* public static int genInt(){
        Random random = new Random();
                int coin = random.nextInt(2);
        return coin;}*/
    /*public static String toTitleCase(String str){
        str = str.toLowerCase();
        String fName = str.substring(0, str.indexOf(" "));
        String lName = str.substring(str.indexOf(" ")+1);  
        String fLetfName = fName.charAt(0) + "";
        String fLetlName = lName.charAt(0) + "";
        return fLetfName.toUpperCase() + str.substring(1, str.indexOf(" ")) + " " +
                fLetlName.toUpperCase() + str.substring(str.indexOf(" ") + 2);
    }*/
}
