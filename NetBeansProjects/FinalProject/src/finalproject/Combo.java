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
public class Combo {
    private Dish dish;
    private Beverage beverage;
    
    public Combo(){
        this.dish = new Dish();
        this.beverage = new Beverage();
    }

    public Combo(Dish dish, Beverage beverage) {
        this.dish = dish;
        this.beverage = beverage;
    }
    
    public Combo(Combo combo){
        this.beverage = combo.beverage;
        this.dish = combo.dish;
    }
    
    public double calcComboPrice(){
        return (dish.calcDishPrice() + beverage.getPrice()) * 0.9;
    }

    public boolean equals(Combo combo){
        return this.dish.equals(combo.dish) && this.beverage.equals(combo.beverage);
    }
    
    @Override
    public String toString(){
        String str = "";
        
          str += "Dish:\n";
          str += dish.toString();
          str += "\n\nBeverage:\n";
          str += beverage.toString();
          
        return str;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public Dish getDish() {
        return dish;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
}
