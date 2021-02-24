/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2assig2;
import java.util.Arrays;

/**
 *
 * @author Igor Raigorodskyi
 */
public class First_3_tasks {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public static double sum(double[] nums) {
        double sum = 0;

        for (double num : nums) {
            sum += num;
        }
        return sum;
    }
    
    public static double avg(double[] nums) {
        return sum(nums) / nums.length;
    }
    
    public static double min(double[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
    
    /**
     * Deletes an element of the array
     * @param nums - given array
     * @param idx - index of the given array that needs to be removed
     * @return array without the element located on index 
     */
    public static double[] delete(double[] nums, int idx) {
        double[] nums2 = Arrays.copyOf(nums, nums.length - 1);

        for (int i = idx + 1; i < nums.length; i++) {
            nums2[i - 1] = nums[i];
        }
        return nums2;
    }
    
    /**
     *  Generates a sequence of uniformly distributed numbers
     * @param startNum first number of the sequence
     * @param endNum last number of the sequence
     * @param amount - amount of numbers in the sequence
     * @return the sequence of distributed numbers
     */
    public static double[] generateUniformDistributionNum(double startNum, double endNum, int amount) {
        // min and max num are used if the start num is bigger than the end num
        double minNum = Math.min(startNum, endNum);
        double maxNum = Math.max(startNum, endNum);
        // we'd immideately return the 2 nums if amount is less or equals 2
        if (amount <= 2) {
            return new double[] {minNum, maxNum};
        }
        /* distance is difference between the biggest num and smallest num devided
                by the amount of nums that should be in between. The amount - 1 if because 
                we remove the last and first nums of the array (-2) and add 1 (+1)
                because we count the spaces between the nums and not the nums themselves so -2 + 1 = -1*/
        double distance = ((maxNum - minNum) / (amount - 1));
        /* the length of the new array  with distributed nums would be the 'amount' of nums 
                that we need to have between start and end num and the numbers themselves*/ 
        double[] distrNums = new double[amount];        
        // process of distribution
        distrNums[0] = minNum;
        distrNums[distrNums.length - 1] = maxNum;
        for (int i = 1; i < distrNums.length - 1; i++) {
            distrNums[i] = distrNums[i - 1] + distance;
        }
        return distrNums;
    }
    
    /**
     * Calculates the final score of an athlete
     * @param scores - scores given by the judges
     * @return average of scores without lowest score and highest score
     */
    public static double calcFinalScore(double[] scores) {
        Arrays.sort(scores);
        // middleScores are the scores between the smallest and biggest one
            //-2 is used because we get rid of first number of the array and last one 
        double[] middleScores = Arrays.copyOf(delete(scores, 0), scores.length - 2);
        return avg(middleScores);
    }
}
