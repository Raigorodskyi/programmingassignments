/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author 2003i
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Beverage("Cola", 2.00,600);
        //System.out.println(beverage.toString());
        Dish dish = new Dish("Spaghetti", 's', 10.00, true);
        //System.out.println(dish.toString());
        Customer customer = new Customer("John", 2, 300);
        //System.out.println(customer.toString());
        Combo combo = new Combo(dish,beverage);
        //System.out.println(combo.toString());
        Tax tax = new Tax();
        //System.out.println(tax.toString());
        Bill bill = new Bill(dish,beverage,customer);
        System.out.println(bill.toString());
    }
    
}
