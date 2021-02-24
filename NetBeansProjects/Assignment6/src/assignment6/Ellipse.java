/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;
import java.util.Random;
/**
 *
 * @author Igor Raigorodskyi
 */
public class Ellipse {
    private double majorAxis;
    private double minorAxis;
    
    /**
     * Default constructor, random majorAxis and minorAxis in range [5,10]
     */
    public Ellipse() {
        int min = 5;
        int max = 10;
        Random rand = new Random();
        this.majorAxis = rand.nextInt(max - min + 1) + min;      
        this.minorAxis = rand.nextInt(max - min + 1) + min;
    }
    
    /**
     * Constructor with majorAxis and minorAxis
     * @param majorAxis the major axis of the ellipse
     * @param minorAxis the minor axis of the ellipse
     */
    public Ellipse(int majorAxis, int minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }
    
     /**
     * Copy constructor
     * @param ellipse another constructor 
     */
    public Ellipse(Ellipse ellipse) {
        this.majorAxis = ellipse.majorAxis;
        this.minorAxis = ellipse.minorAxis;
    }
    
    /**
     * To calculate the area of a ellipse
     * @return the area of an ellipse
     */
    public double calcArea() {
        return majorAxis * minorAxis * Math.PI;
    }
    
    /**
     * To calculate the perimeter of an ellipse
     * @return the perimeter of an ellipse
     */
    public double calcPerimeter() {
        return Math.sqrt((Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2)) / 2) *
                2 * Math.PI;
    }
    
    /**
     * To compare majorAxis and minorAxis
     * @return if the two axis are the same
     */
    public boolean isCircle() {
        return this.majorAxis == this.minorAxis;
    }
    
    /**
     * Check if the major axis is valid
     * @return if the major axis is valid
     */
    public boolean isMajorAxisValid(){
        return this.majorAxis < 0;
    }
    
    /**
     * Check if the minor axis is valid
     * @return if the minor axis is valid
     */
    public boolean isMinorAxisValid(){
        return  this.minorAxis < 0;
    }
    
    /**
     * To generate a string to represent an ellipse
     * @return a string to represent an ellipse
     */
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%-15s: %.2f\n", "Major-Axis", majorAxis);
        str += String.format("%-15s: %.2f\n", "Minor-Axis", minorAxis);
        str += String.format("%-15s: %.2f\n", "Area", calcArea());
        str += String.format("%-15s: %.2f\n", "Perimeter", calcPerimeter());
        if (isCircle() == true) {
            str += "This ellipse is a circle";
        } else {
            str += "This ellipse is not a circle";
        }
        return str;
    }
    
    /**
     * Compare two ellipses
     * @param ellipse another ellipse
     * @return if the two ellipses are the same
     */
    public boolean equals(Ellipse ellipse) {
        return this.majorAxis == ellipse.majorAxis && this.minorAxis == ellipse.minorAxis;
    }
    
    public double getMinorAxis() {
        return minorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if (isMajorAxisValid()) {
            this.majorAxis = majorAxis;
        } 
        else {
            System.out.println("The new value must be a positive value");
        }
    }

    public void setLength(double minorAxis) {
        if (isMinorAxisValid()) {
            this.minorAxis = minorAxis;
        } 
        else {
            System.out.println("The new value must be a positive value");
        }
    }
}
