/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Igor Raigorodskyi
 */
public class toLetterScore {
    public static void main(String[] args) {
        //System.out.println(printMessage(toLetterScore(95)));
    }
    /**
     * 
     * @param digitScore is the initial parameter. We want to check what 
     * letter score is associated to this number
     * @return the letter score
     */
    public static char toLetterScore(double digitScore){
    // if/else structure
        if(digitScore>=90 && digitScore<=100){
            return 'A';}
        if(digitScore>=80 && digitScore<90){
            return 'B';}
        if(digitScore>=70 && digitScore<80){
            return 'C';}
        if(digitScore>=60 && digitScore<70){
            return 'D';}
        else{
            return 'E';}
    }
    /**
     * 
     * @param letterScore the initial parameter. We want to check what message can 
     * be associated to this letter score.
     * @return the message
     */
    public static String printMessage(char letterScore){
        //bringing the Score to lowercase
        String toLow = "";
        toLow+=letterScore;
        toLow = toLow.toLowerCase();
        char lowCaseScore = toLow.charAt(0);
    // if/else structure
        /*if (lowCaseScore=='a') {
            return "Exellent";}
        if (lowCaseScore=='b' || lowCaseScore=='c') {
            return "Well done";}
        if (lowCaseScore=='d') {
            return "Passed";}
        else{
            return "Failed";}*/
    // switch...case
        switch(lowCaseScore){
            case 'a':
                return "Exellent";
            case 'b':
            case 'c':
                return "Well done";
            case 'd':
                return "Passed";
            default:
                return "Failed";
        }
    }
}
