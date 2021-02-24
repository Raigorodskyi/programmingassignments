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
public class calcDays {
    public static void main(String[] args) {
        System.out.println(calcDays(2, 1903));
    }
    /**
     * 
     * @param year that we want to check, if it is a leap year or not
     * @return true (is a leap year) or false (is not a leap year)
     */
    public static boolean isLeapYear (int year){
        return year%4==0;}
    
        /**
         * 
         * @param mounth is to precise the month in which the number of days is needed
         * @param year is to indicate the year of the month 
         * @return number of days of the month 
         */
    public static  int calcDays(int mounth, int year){
    // if/else structure
        int days = 0;
        if (mounth<8) {
            if (mounth%2==0) {
                days+=30;}
            else{
                days+=31;}
        }
        else{
            if (mounth%2==0) {
                days+=31;}
            else{
                days+=30;}
        }
        if (isLeapYear(year)==true) {
            if (mounth==2) {
                days-=1;}
            else{
                days+=0;}
        }
        else{
            if(mounth==2){
                days-=2;}
            else{
                days+=0;}
        }
        return days;
    // switch...case structure
        /*if (isLeapYear(year)==true){
            switch(mounth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 29;
            default:
                return 30;}
        }
        else{
            switch(mounth){
            case 2:
                return 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return 30;}
        }*/
    }     
}
