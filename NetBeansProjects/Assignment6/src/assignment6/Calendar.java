/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author Igor Raigorodskyi
 */
public class Calendar {
    private int year;
    private int month;
    private int day;
    
    /**
     * Default constructor year = 2020, month = 1, day =1
     */
     public Calendar() {
        this.year = 2020;
        this.month = 1;
        this.day = 1;
    }
     
     /**
      * Constructor with year, month and day
      * @param year the year of calendar
      * @param month the month of calendar
      * @param day  the day of calendar
      */
    public Calendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    /**
     * Copy constructor
     * @param calendar another constructor 
     */
    public Calendar(Calendar calendar) {
        this.year = calendar.year;
        this.month = calendar.month;
        this.day = calendar.day;
    }
    
    /**
     * To increase day by 1
     * @return day increased by 1
     */
    public int increaseDay(){
        day++;
        if (getDaysInMonth() < day) {
            day = 1;
            increaseMonth();
        }
        return day;
    }
    
    /**
     * To increase month by 1
     * @return month increased by 1
     */
    public int increaseMonth(){
        month++;
        if (month == 13) {
            month = 1;
            increaseYear();
        }
        return month;
    }
    
    /**
     * To increase year by 1
     * @return year increased by 1
     */
    public int increaseYear(){
        year++;
        return year;
    }
    
    /**
     * Check if the year is leap or not
     * @return true if the year is leap and false if it is not
     */
    public boolean isLeapYear(){
        return year % 4 == 0;
    }
    
    /**
     * To generate a string to represent the calendar
     * @return a string to represent the calendar
     */
    @Override
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
    
    /**
     * To know how many days there is in the current month
     * @return number of days in the month
     */
    public int getDaysInMonth(){
        if (isLeapYear()) {
            switch(month){
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                default:
                    return 29;
                                
            }
        } 
        else {
            switch(month){
                case 2:
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
    
    /**
     * Compare two calendars
     * @param calendar another calendar
     * @return if two calendars are the same
     */
    public boolean equals(Calendar calendar) {
        return this.year == calendar.year &&
                this.month == calendar.month &&
                this.day == calendar.day;
    }
    
    public double getYear() {
        return year;
    }

    public double getMonth() {
        return month;
    }
    
    public double getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
}
