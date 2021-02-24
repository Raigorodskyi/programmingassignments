/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singledimentionarray;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author 2003i
 */
public class SingleDimentionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] nums = new double [5];    // a double arrays with 5 elements
        double [] nums2 = {3, 5 , -3, 3, -1, 10, 9, 34, 55};  // double array with specific initialized arrays
        double [] nums3;
        double [] nums4 = {3, 44 , -70, 3, -1, 10, 18, 34}; 
        double [] nums5 = {3, 44 , -70, 3, -1, 10, 18, 34}; 
        nums3 = new double [] {nums[0], nums2[4]};  // declare an array and initialize it later
        String[] strings = {"Shalom", "Maapekha shel simkha"};
//        System.out.println(nums2[4]);   // read element of an array
//        nums[0] = -1;                               // modify element of an array
//        System.out.println(nums[0]);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(countOddNum(nums4));
//        System.out.println(sumOddPositions(nums2));
//        boolean [] bool = {true, false,true, true,false,true, true,false,false,false,false,false};
//        System.out.println(sum(nums2, bool));
//        System.out.println(Arrays.toString(remouve(nums2, 7)));
//          addValue(nums2, 10);
//          appendValue(nums2, 2);
//          remouveEdge(strings);
//          System.out.println(Arrays.toString(strings));
          //System.out.println(Arrays.toString(getMax(nums2, nums5)));
          double [][] numss = {{1, 11, 23, 45, 630}, {0, 88, 86, 21, 45, 1 , 4}, {0, 9, 3, 14}};
//          appendNum(numss, 4.5, 2);
////          appendNum(numss, 77, 0);
//          System.out.println(Arrays.deepToString(appendNum(numss, 33, 2)));
//          System.out.println(Arrays.deepToString(generateRandomMatrix(3, 4, 5.5, 3.1)));
          Course course = new Course();
//          System.out.println(Arrays.toString(course.calcFinalScores()));
          System.out.println(course.toString());
        
        
    }
    
    public static double[] remove(double[] nums, int idx) {
        double [] nums2 = new double[nums.length - 1];
        for (int i = 0; i < nums2.length; i++) {
            if (i < idx) {
                nums2[i] = nums[i];
            }
            else if (i == idx) {
            }
            else {
                nums2[i-1] = nums[i];
            }
        }
        return nums2;
    }
    
    public static double[] reciprocial(double[] nums){
        double[] numsRecipr = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsRecipr[i] = 1/nums[i];
        }
        return numsRecipr;
        
        /* 
        or 
        Arrays.fill(numsRecipr, 1);
        
        for (int i = 0; i < nums.length; i++) {
            numsRecipr[i] /= nums[];
        OLYA DURA AZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZZAZAZAZAZAZAZAZAZAZAZAZA
        }
        */
    }
    
    public static double sum(double [] nums){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    
    public static void addValue(double[] nums, double value){ 
        for (int i = 0; i < nums.length; i++) {
            nums[i] += value;
        }
    }
    
    public static int countOddNum(int [] nums){
        int oddNumsNumber = 0;
        for (int num : nums) {
            if (num % 2 !=0) {
            oddNumsNumber++;
            }
        }
        return oddNumsNumber;
    }
    
    public static double sumOddPositions(double [] nums){
        double sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
    
    public static double sum(double[] nums, boolean[] flag) {
        double sum = 0;
        if (nums.length < flag.length) {
            for (int i = 0; i < nums.length; i++) {
                if (flag[i] == true) {
                    sum += nums[i];
                }
            }
        }
        else {
            for (int i = 0; i < flag.length; i++) {
                if (flag[i] == true) {
                    sum += nums[i];
                }
            }
        }
        return sum;
    }
    
    public static void appendValue(double [] nums, double value) {
        double[] nums2 = Arrays.copyOf(nums, nums.length + 1);
        nums2[nums2.length - 1] = value;
        nums = nums2;
    }
    
    public static int calcVowels(String str) {
        int numOfVow = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'o' || c == 'i' || c == 'e' || c == 'u') {
                numOfVow++;
            }
        }
        return numOfVow;
    }
    
    public static int calcVowels(String[] strs) {
        int count = 0;
        for (String str : strs) {
            count += calcVowels(str);
        }
        return count;
    }
    
    public static void remouveEdge(String[] strs) {
        for (int i = 0; i < strs.length; i++){
            strs[i] = strs[i].substring(1, strs[i].length() - 1);
        }
    }
    
    public static double[] getMax(double[] nums, double[] nums2) {
        double[] nums3 = new double[Math.max(nums.length, nums2.length)];
        if (nums.length >= nums2.length) {
            for (int i = 0; i < nums.length; i++) {
                if (i < nums2.length) {                    
                    nums3[i] = Math.max(nums[i], nums2[i]);
                }
                else {
                    nums3[i] = nums[i];
                }
            }
        }
        else {
        for (int i = 0; i < nums2.length; i++) {
                if (i < nums.length) {                    
                    nums3[i] = Math.max(nums[i], nums2[i]);
                }
                else {
                    nums3[i] = nums2[i];
                }
            }
        }
        return nums3;
    }
    
    public static double max(double[][] numss) {
        double max = 0;
        
        for (double[] nums : numss) {
            for (double num : nums) {
                max = Math.max(max, num);
            }
        }
        return max;
    }
    
    public static double[] maxInRow(double[][] numss) {
        double[] maxNums = new double [numss.length];
        Arrays.fill(maxNums, Double.NEGATIVE_INFINITY);
        for (int i = 0; i < numss.length; i++) {
            for (double num : numss[i]) {
                maxNums[i] =Math.max(maxNums[i], num);
            }
        }
        return maxNums;
    }
    
    public static double[] avgInRow(double[][] numss) {
        double[] avg = new double[numss.length];
        for (int i = 0; i < numss.length; i++) {
            avg[i] = sum(numss[i]) / numss[i].length;
        }
        return avg;
    }
    
    public static double[] maxInCol(double[][] numss) {
        int maxCol = 0;
        for (double[] nums : numss) {
            maxCol = Math.max(maxCol, nums.length);
        }
        double[] maxs = new double[maxCol];
        Arrays.fill(maxs, Double.NEGATIVE_INFINITY);
        
        for (double[] nums : numss) {
            for (int j = 0; j < nums.length; j++) {
                maxs[j] = Math.max(nums[j], maxs[j]);
            }
        }
        return maxs;
    }
    
    public static double[] avgInCol(double [][] numss) {
        int maxCol = 0;
        for (double[] nums : numss) {
            maxCol = Math.max(maxCol, nums.length);
        }
        
        double[] avgs = new double[maxCol];
        double[] counts = new double[maxCol];
        
        for (double[] nums : numss) {
            for (int j = 0; j < nums.length; j++) {
                avgs[j] += nums[j];
                counts[j]++;
            }
        }
        
        for (int i = 0; i < avgs.length; i++) {
            avgs[i] /= counts[i];
        }
        
        return avgs;
    }
    
    public static double[][] appendNum(double[][] numss, double num, int rowIdx) {
        double[] nums = Arrays.copyOf(numss[rowIdx], numss[rowIdx].length + 1);
        nums[nums.length - 1] = num;
        
        numss[rowIdx] = nums;
        
        return numss;
    }
    
    public static void appendNumVoid(double[][] numss, double num, int rowIdx) {
        double[] nums = Arrays.copyOf(numss[rowIdx], numss[rowIdx].length + 1);
        nums[nums.length - 1] = num;
        
        numss[rowIdx] = nums;
    }
    
    public static double[][] appendRow(double[][] numss, double[] nums, int rowIdx) {
        double[][] numss2 = new double[numss.length + 1][];
        numss2[rowIdx] = nums;
        for (int i = 0; i < rowIdx; i++) {
            numss2[i] = numss[i];
        }
        for (int i = rowIdx + 1; i < numss2.length; i++) {
            numss2[i] = numss[i - 1];
        }
        return numss2;
    }
    
    public static double[][] generateRandomMatrix(int row, int col, 
            double bound1, double bound2) {
        Random rand = new Random();
        double max = Math.max(bound2, bound1);
        double min = Math.min(bound2, bound1);
        double[][] numss = new double[row][col];
        for (double[] nums : numss) {
            for (int j = 0; j < nums.length; j++){
               double ran = new Random().nextDouble();
               nums[j] = min + (ran * (max - min));
            }
        }
        return numss;
    }
}

