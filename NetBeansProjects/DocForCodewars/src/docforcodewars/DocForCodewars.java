/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docforcodewars;

//import java.util.Scanner;

import java.util.Arrays;
import java.util.Stack;


/**
 *
 * @author 2003i
 */
public class DocForCodewars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] no= {1,2,3};
        //System.out.println(findIt(new int[]{1,1,2,4,4,2,5,6,7,7,5,5,5,1,1}));;
        //System.out.println(camelCase("ShalomLeKoolam"));
        //System.out.println((twoSum(no, 4)));
    }
    public static int findIt(int[] a) {
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[i] == a[j]){
                    count++;
                }
            }
            if (count % 2 == 1) {
                odd = a[i];
            }
        }
  	return odd;
  }
    public static String longest (String s1, String s2) {
        String uniStr = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if (s1.contains(alphabet.charAt(i) + "") && 
                    s2.contains(alphabet.charAt(i) + "")) {
                uniStr+=alphabet.charAt(i);
            }
        }
        return uniStr;
    }
    
    public static String camelCase(String input) {
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            String c = Character.toString(input.charAt(i));
            if (c.equals(c.toUpperCase())) {
                str += " ";
            }
            str += c;
        }
        return str;
  }
    
    public boolean isValid(String braces) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '{' || braces.charAt(i) == '[' || 
                    braces.charAt(i) == '(') {
                st.push(braces.charAt(i));
            } else if (!st.empty() && (
                    (braces.charAt(i) == ']' && st.peek() == '[') ||
                    (braces.charAt(i) == '}' && st.peek() == '{') ||
                    (braces.charAt(i) == ')' && st.peek() == '('))) {
                st.pop();
            } else {
                st.push(braces.charAt(i));
            }
        }
        return st.empty();
  }
    
   /* public static int[] twoSum(int[] numbers, int target) {
        int[] solution = {1};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    solution[0] += i;
                    solution[1] += j;
                }
            }
        }
        return solution;
    }*/
}

