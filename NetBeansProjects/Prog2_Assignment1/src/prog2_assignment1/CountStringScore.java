/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2_assignment1;

/**
 *
 * @author Igor Raigorodskyi
 */
public class CountStringScore {
    public static void main(String[] args) {
    }
    
    public static double countStringScore(String str) {
        double score = 0;
        if (str.isEmpty() || str == null) {
            return score;
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    score += 2;
                }
                if (Character.isDigit(str.charAt(i))) {
                    score += 1;
                }
                if (str.charAt(i) == ' ') {
                    score += 0;
                }
                if (!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i)!= ' ') {
                    score += 3;
                }
            }
        }
        return Math.ceil(score / str.length() * 100) / 100;
    }
}
