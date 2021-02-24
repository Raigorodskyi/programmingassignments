/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singledimentionarray;
import java.util.Arrays;
/**
 *
 * @author 2003i
 */
public class Course {
    private double[][] scoress;
    private double[] weights;
    public Course() {
        this.scoress = SingleDimentionArray.generateRandomMatrix(20, 10, 50, 100);
        this.weights = new double[]{0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.3, 0.3};
    }
   
    public double[] calcFinalScores() {
        double[] finalScores = new double[scoress.length];
        for (int i = 0; i < scoress.length; i++) {
            for (int j = 0; j < weights.length; j++) {
                finalScores[i] += weights[j] * scoress[i][j];
            }
        }
        return finalScores;
    }
    
    public double[] calcAssignAvgs() {
        return SingleDimentionArray.avgInCol(scoress);
    }
    
    public double[] calcAssignStds() {
        double[] avgs = SingleDimentionArray.avgInCol(scoress);
        double[] SDs = new double[avgs.length];
        
        for (int i = 0; i < scoress.length; i++) {
            for (int j = 0; j < avgs.length; j++) {
                SDs[j] += Math.pow(scoress[i][j] - avgs[j], 2);
            }
            SDs[i] /= scoress.length;
            SDs[i] = Math.sqrt(SDs[i]);
        }
        
        return SDs;
    }
    
    @Override
    public String toString() {
        double[] avgs = calcAssignAvgs();
        double[] stds = calcAssignStds();
        double[] finalScores = calcFinalScores();
                
        int row = scoress.length;
        int col = scoress[0].length;
        
        String str = "";
        
        // row header 
        str += String.format("%-7s", "");
        for (int j = 0; j < 10; j++) {
            str += String.format("A%-6d", j + 1);
        str += String.format("%11s", "Final\n");
        }
        
        //scores 
        for (int i = 0; i < row; i++) {
            str += String.format("S%-6D", i + 1);
            for (double score : scoress[i]) {
                str += String.format("%-7.1f", score);
                str += '\n';
            }
            str += String.format("%10.1f\n", finalScores[i]);
        }
        
        //avgs 
         str += String.format("%-7s", "Avg");
         for (int i = 0; i < col; i++) {
            str += String.format("%-7.1f", avgs[i]);
            str += '\n';
        }
         
        //stds 
         str += String.format("%-7s", "Std");
         for (int i = 0; i < col; i++) {
            str += String.format("%-7.1f", stds[i]);
            str += '\n';
        }
        
        return str;
    }

    public double[][] getScoress() {
        return scoress;
    }

    public double[] getWeights() {
        return weights;
    }
    
    
}
