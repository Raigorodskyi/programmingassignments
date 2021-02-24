/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Igor Raigorodskyi
 */
public class BirthYearCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //input
        System.out.println("Please input a birth year: ");
        String year = console.nextLine();
        //process
        char decade0 = year.charAt(year.length() - 2);
        String century0 = year.substring(0, year.length() - 2);
        String decade = decade0 + "0";
        int century = Integer.parseInt(century0) + 1;
        //output
        System.out.printf("%-13s: %s\n", "Birth Year", year);
        System.out.printf("%-13s: %d\n", "Century", century);
        System.out.printf("%-13s: %s\n", "Decade", decade);
    }
}
