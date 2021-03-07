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
public class Square extends Rectangular {

    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(Square square) {
        super(square);
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %.2f\n", "Size", getHeight());
        
        
        return str;
    }
    
    
    
    
   
    
    
}
