/*
 * MIT License

Copyright (c) [2021] [Igor Raigorodskyi]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package prog2assign03;
import java.util.Arrays;
/**
 *
 * @author Igor Raigorodskyi
 */
public class Task1 {
    
    /**
     * Finds the min value in a 2D array
     *
     * @param numss the input 2D array
     * @return the min value in the 2D array
     */
    public double min(double[][] numss) {
        double min = Double.NEGATIVE_INFINITY;

        for (double[] nums : numss) {
            for (double num : nums) {
                min = Math.min(min, num);
            }
        }
        return min;
    }
    
    /**
     * Finds the min in each row of a 2D array.
     * @param numss the input 2D array
     * @return the min in each row 
     */
    public double[] minOfRow(double[][] numss) {
        double[] mins = new double[numss.length];      
        Arrays.fill(mins, Double.NEGATIVE_INFINITY); 

        for (int i = 0; i < numss.length; i++) {
            for (double num : numss[i]) {
                mins[i] = Math.min(num, mins[i]);
            }
        }
        return mins;
    }
    
    /**
     * Finds the min in each column of a 2d array.
     * @param numss the input 2D array
     * @return the min in each column of that 2d array
     */
    public double[] minOfCol(double[][] numss) {
        // find the longest row in the 2d array
        int maxCol = 0;
        for (double[] nums : numss) {
            maxCol = Math.max(maxCol, nums.length);
        }
        double[] mins = new double[maxCol];    
        Arrays.fill(mins, Double.NEGATIVE_INFINITY);   

        for (double[] nums : numss) {
            for (int j = 0; j < nums.length; j++) {
                mins[j] = Math.min(nums[j], mins[j]);
            }
        }
        return mins;
    }
    
    public double[][] add(double[][] numss1, double[][] numss2) {
        // creating new 2D array that would be like a sum of numss1 and numss2
        double [][] sumNumss = new double [Math.max(numss1.length, numss2.length)][];
        // these 2 new 2D arrays are going to be used later to initiate the arrays
                //in sumNums and adding numbers
        double [][] smallNumss;
        double [][] bigNumss;
        /*
        creating the arrays inside of the 2D array
        */
        // if the 2 2D arrays have the same length
        if (numss1.length == numss2.length) {
            for (int i = 0; i < sumNumss.length; i++) {
                sumNumss[i] = new double[Math.max(numss1[i].length, numss2[i].length)];
            }
            
            for (int i = 0; i < sumNumss.length; i++) {
                if (numss1[i].length == numss2[i].length) {
                    for (int j = 0; j < sumNumss[i].length; j++) {
                        sumNumss[i][j] = Double.sum(numss1[i][j], numss2[i][j]);
                    }
                } else {
                    double [] smallNums;
                    double [] bigNums;
                    if (numss2[i].length > numss1[i].length) {
                        smallNums = Arrays.copyOf(numss1[i], numss1[i].length);
                        bigNums = Arrays.copyOf(numss2[i], numss2[i].length); 
                } else {
                        bigNums = Arrays.copyOf(numss1[i], numss1[i].length);
                        smallNums = Arrays.copyOf(numss2[i], numss2[i].length); 
            }
                    for (int j = 0; j < smallNums.length; j++) {
                        sumNumss[i][j] = Double.sum(smallNums[j], bigNums[j]);
                    }
                    for (int j = smallNums.length; j < bigNums.length; j++) {
                        sumNumss[i][j] = bigNums[j];   
                    }
                }
            }
        } else {       
            // in case if the length of both 2D arrays is different
                // creating new 2D arrays to figure out which one of the arrays 
                // is shorter and which one is longer
            if (numss1.length < numss2.length) {
                smallNumss = Arrays.copyOf(numss1, numss1.length);
                bigNumss = Arrays.copyOf(numss2, numss2.length);
            } else {
                smallNumss = Arrays.copyOf(numss2, numss2.length);
                bigNumss = Arrays.copyOf(numss1, numss1.length);
            }
            
            // creating the arrays in sumNumss using these new 2D arrays
            for (int i = 0; i < smallNumss.length; i++) {
                sumNumss[i] = new double[Math.max(smallNumss[i].length, bigNumss[i].length)];
            }
            for (int i = smallNumss.length; i < sumNumss.length; i++) {
                sumNumss[i] = Arrays.copyOf(bigNumss[i], bigNumss[i].length);
            }
            
            // putting the sums on their places
            for (int i = 0; i < smallNumss.length; i++) {
                if (smallNumss[i].length == bigNumss[i].length) {
                    for (int j = 0; j < sumNumss[i].length; j++) {
                        sumNumss[i][j] = Double.sum(smallNumss[i][j], bigNumss[i][j]);
                    }
                } else {
                    double [] smallNums;
                    double [] bigNums;
                    if (bigNumss[i].length > smallNumss[i].length) {
                        smallNums = Arrays.copyOf(smallNumss[i], smallNumss[i].length);
                        bigNums = Arrays.copyOf(bigNumss[i], bigNumss[i].length); 
                } else {
                        bigNums = Arrays.copyOf(smallNumss[i], smallNumss[i].length);
                        smallNums = Arrays.copyOf(bigNumss[i], bigNumss[i].length); 
            }
                    for (int j = 0; j < smallNums.length; j++) {
                        sumNumss[i][j] = Double.sum(smallNums[j], bigNums[j]);
                    }
                    for (int j = smallNums.length; j < bigNums.length; j++) {
                        sumNumss[i][j] = bigNums[j];   
                    }
                }
            }
        }
        return sumNumss;
    }
    
    /**
     * Deletes the chosen row 
     * @param numss the input 2D array
     * @param idx the index of the array to delete
     * @return 2D array without the chosen row
     */
    public double[][] deleteRow(double[][] numss, int idx) {
        double [][] numssDeleted = new double [numss.length - 1][];
        
        for (int i = 0; i < idx; i++) {
             numssDeleted[i] = numss[i];
        }
        for (int i = idx + 1; i < numss.length; i++) {
            numssDeleted[i - 1] = numss[i];
        }
        
        return numssDeleted;
    }
    
    /**
     * Joins 2 2D arrays
     * @param numss1 the first input 2D array 
     * @param numss2 the second input 2D array
     * @return 2D array containing all the arrays from 1st and 2nd 2D arrays
     */
    double[][] appendArray(double[][] numss1, double[][] numss2) {
        double [][] unitedArray = new double [numss1.length + numss2.length][];
        
        System.arraycopy(numss1, 0, unitedArray, 0, numss1.length);
        System.arraycopy(numss2, 0, unitedArray, numss1.length, numss2.length);
        
        return unitedArray;
    }
    
    /**
     * Expands the array. Basically unites the 2 arrays at the same index
     * @param numss1 first input 2D array
     * @param numss2 second input 2D array
     * @return expanded 2D array
     */
    double[][] expendArray(double[][] numss1, double[][] numss2) {
        double [][] expendedArray = new double [Math.max(numss1.length, numss2.length)][];
        //if else loop to verify if the 2 2D arrays are of the same length
        if (numss1.length == numss2.length) {
            for (int i = 0; i < expendedArray.length; i++) {
                expendedArray[i] = new double[numss1[i].length + numss2[i].length];
                System.arraycopy(numss1[i], 0, expendedArray[i], 0, numss1[i].length);
                System.arraycopy(numss2[i], 0, expendedArray[i], numss1[i].length, numss2[i].length);
            }
        } else {
            // we figure out which of the arrays is smaller and which one is bigger
            double [][] smallNumss; 
            double [][] bigNumss;
            if (numss1.length < numss2.length) {
                smallNumss = Arrays.copyOf(numss1, numss1.length);
                bigNumss = Arrays.copyOf(numss2, numss2.length);
            } else {
                bigNumss = Arrays.copyOf(numss1, numss1.length);
                smallNumss = Arrays.copyOf(numss2, numss2.length);
            }
            // we fill out the expanded array with the numbers of an extra array from bigNumss 
            for (int i = smallNumss.length; i < bigNumss.length; i++) {
                expendedArray[i] = bigNumss[i];
            }
            // the distribution of nums like if there was not an extra array
            for (int i = 0; i < smallNumss.length; i++) {
                expendedArray[i] = new double[numss1[i].length + numss2[i].length];
                System.arraycopy(numss1[i], 0, expendedArray[i], 0, numss1[i].length);
                System.arraycopy(numss2[i], 0, expendedArray[i], numss1[i].length, numss2[i].length);
            }
        }
        return expendedArray;
    }
    
    /**
     * Flips the row and the column of matrix
     * @param numss input matrix
     * @return flipped matrix
     */
    public double[][] transposeMatrix(double[][] numss) {
        int oldRow = numss[0].length;
        int oldColumn = numss.length;
        double [][] transposedMatrix = new double[oldRow][oldColumn];
        for (int i = 0; i < numss.length; i++) {
            for (int j = 0; j < numss[i].length; j++) {
                transposedMatrix[j][i] = numss[i][j];
            }
        }
        return transposedMatrix;
    }
}