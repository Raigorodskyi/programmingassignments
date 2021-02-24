/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2_assignment1;

/**
 *
 * @author 2003i
 */
public class Prog2_Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address address = new Address("fgbdfv dfc", 1234, "osheagA", "h4j4hh4");
        //System.out.println(address.toString());
        Student student = new Student("anItA", "raigorodska", 23, address);
        student.setfName("aLooh");
        student.setlName("RozHDEsTvenskaya");
        System.out.println(student.toString());
    }
    
}
