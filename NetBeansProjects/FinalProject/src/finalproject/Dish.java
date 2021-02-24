/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Igor Raigorodskyi
 */
public class Dish {
    String dishId;
    String dishName;
    char size;
    double price;
    boolean spicy;
    private static int nextId = 1;
    
    public Dish(){
        this.dishId = String.format("D%03d", generateId());
        this.dishName = null;
        this.size = ' ';
        this.price = 0;
        this.spicy = false;
    }
    
    public Dish(String dishName, char size, double price, boolean spicy){
        this.dishId = String.format("D%03d", generateId());
        this.dishName = dishName;
        this.size = size;
        this.price = price;
        this.spicy = spicy;
    }
    
    public Dish(Dish dish){
        this.dishId = dish.dishId;
        this.dishName = dish.dishName;
        this.size = dish.size;
        this.price = dish.price;
        this.spicy = dish.spicy;
    }
    
    public static int generateId(){
        return nextId++;
    }
    
    public double calcDishPrice(){
        switch(size){
            case 'x':
            case 'X':
                return price * 1.2;
            case 'm':
            case 'M':
                return price * 0.6;
            case 's':
            case 'S':
                return price * 0.4;
            default:
                return price;
        }
    }
    
    public boolean equals(Dish dish){
        return this.dishId.equals(dish.dishId) && this.dishName.equals(dish.dishName)
                && this.size == dish.size && this.price == dish.price && 
                this.spicy == dish.spicy;
    }
    
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%-10s%-20s: %s\n", " ", "Dish ID", dishId);
        str += String.format("%-10s%-20s: %s\n", " ", "Dish Name", dishName);
        str += String.format("%-10s%-20s: %s\n", " ", "Dish Size", size);
        str += String.format("%-10s%-20s: %.2f\n", " ", "Dish Price",calcDishPrice());
        if (spicy == true) {
            str += String.format("%-10s%-20s: %s\n", " ", "Spicy", "Spicy");
        } else {
            str += String.format("%-10s%-20s: %s\n", " ", "Spicy", "Not Spicy");
        }
        
        return str;
    }

    public String getDishId() {
        return dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public static int getNextId() {
        return nextId;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public static void setNextId(int nextId) {
        Dish.nextId = nextId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }
}
