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
public class Circle extends Ellipse{
    
    public Circle() {
        super();
    }
    
    public Circle(double diameter) {
        super(diameter, diameter);
    }
    
    public Circle(Circle circle) {
        super(circle);
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %.2f\n", "Size", getHeight());
        
        
        return str;
    }

    public double getDiameter() {
        return super.getHeight(); 
    }
    
    public void setDiameter(double diameter) {
        super.setHeight(diameter);
        super.setLength(diameter);
    }
}
