/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentprogramming1;
import java.util.Scanner;
/**
 *
 * @author Igor Raigorodskyi
 */
public class PersonalInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = console.nextLine();
        System.out.print("Please enter your age: ");
        int age = console.nextInt();
        console.nextLine();
        System.out.print("Please enter your gender: ");
        String gender = console.nextLine();
        System.out.print("Please enter your department: ");
        String department = console.nextLine();
        System.out.print("Please enter the value of PI (3.1415926): ");
        double Pi = console.nextDouble();
        
        System.out.printf("%-13s: %s\n", "Name", name);
        System.out.printf("%-13s: %s\n", "Age", age);
        System.out.printf("%-13s: %s\n", "Gender", gender);
        System.out.printf("%-13s: %s\n", "Department", department);
        System.out.printf("%-13s: %.2f\n", "PI", Pi); 
    }
    
}
