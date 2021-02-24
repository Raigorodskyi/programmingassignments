/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author 2003i
 */
public class Lobby {
    
    private static Clock[] clocks = new Clock[5];
    public static void main(String[] args) {
        
        clocks[0] = new Clock(0, 0, 0, "London");
        clocks[1] = new Clock(0, 0, 0, "Paris");
        clocks[2] = new Clock(0, 0, 0, "Montreal");
        clocks[3] = new Clock(0, 0, 0, "Beijing");
        clocks[4] = new Clock(0, 0, 0, "Tokyo");
    }
}
