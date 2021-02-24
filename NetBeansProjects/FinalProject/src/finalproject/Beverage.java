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
public class Beverage {
    String beverageID;      
    String beverageName;     
    double price;            
    int volume;              
    private static int nextId = 1;
   
    public Beverage(){
        this.beverageID = String.format("B%03d", generateId());
        this.beverageName = null;
        this.price = 0;
        this.volume = 0;
    }
    
    public Beverage(String beverageName, double price, int volume){
        this.beverageID = String.format("B%03d", generateId());
        this.beverageName = beverageName;
        this.price = price;
        this.volume = volume;
    }
    
    public Beverage(Beverage beverage){
        this.beverageID = beverage.beverageID;
        this.beverageName = beverage.beverageName;
        this.price = beverage.price;
        this.volume = beverage.volume;
    }
    
    public static int generateId(){
        return nextId++;
    }
    
    public double calcPrice(){
        if (volume < 500) {
            return  price;
        }
        else{
            return price * 0.6;
        }
    }
    
    public boolean equals(Beverage beverage){
        return this.beverageName.equals(beverage.beverageName) && 
                this.price == beverage.price && this.volume == beverage.volume && 
                this.beverageID.equals(beverage.beverageID);
    }
    
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%-10s%-20s: %s\n", " ", "Beverage ID", beverageID);
        str += String.format("%-10s%-20s: %s\n", " ", "Beverage Name", beverageName);
        str += String.format("%-10s%-20s: %.2f\n", " ", "Beverage Price", price);
        str += String.format("%-10s%-20s: %s\n\n", " ", "Beverage", volume);
        
        return str;
    }

    public String getBeverageID() {
        return beverageID;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public static int getNextId() {
        return nextId;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public void setBeverageID(String beverageID) {
        this.beverageID = beverageID;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public static void setNextId(int nextId) {
        Beverage.nextId = nextId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
