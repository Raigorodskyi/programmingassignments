/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Random;

/**
 *
 * @author Igor Raigorodskyi
 */
public class calcAverageScore {
    public static void main(String[] args) {
       // System.out.printf("%.2f\n", calcAverageScore(150));
    }
    /**
     * 
     * @param num indicates the quantity of random numbers from 0 to 100 
     * that are going to be used
     * @return the average of the random numbers bigger than 40
     */
    public static double calcAverageScore(int num){
        int count = 0;
        int numsLar40 = 0;
        for (int i = 1; i < num; i++) {
            Random rand = new Random();
            int number = rand.nextInt(101);
            if (number<40) {
                numsLar40 += 0;}
            else
                {numsLar40 += number;
                count++;}
        }
        if (count==0) {
            return numsLar40;}
        return numsLar40 / count;
    }
}
