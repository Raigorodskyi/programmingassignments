/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author 2003i
 */
public class Ellipse extends Shape {
    private double length;
    private double height;

    public Ellipse() {
        this.length = 1;
        this.height = 1;
    }
    
    public Ellipse(double length, double height) {
        this.length = length;
        this.height = height;
    }
    
    public Ellipse(Ellipse ellipse) {
        this.length = ellipse.length;
        this.height = ellipse.height;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ellipse other = (Ellipse) obj;
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %.2f\n", "Length", length);
        str += String.format("%-10s: %.2f\n", "Height", height);
        
        
        return str;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
}
