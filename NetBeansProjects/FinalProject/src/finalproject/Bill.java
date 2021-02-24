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
public class Bill {
    private Combo combo;
    private Customer customer;
    private double orignalPrice;
    private double discountedPrice;
    private Tax tax;
    private double finalPrice;
    
    public Bill(){
        this.combo = new Combo();
        this.customer = new Customer();
        this.orignalPrice = combo.calcComboPrice();
        this.discountedPrice = calcPriceWithDiscount(); 
        this.tax = new Tax(calcFedTax(), clacProTax(), calcTotalTax());
        this.finalPrice = calcFinalPrice(); 
    }
    
    public Bill(Dish dish, Beverage beverage, Customer customer){
        this.combo = new Combo(dish,beverage); 
        this.combo.setBeverage(beverage);
        this.customer = customer;
        this.orignalPrice = combo.calcComboPrice();
        this.discountedPrice = calcPriceWithDiscount();
        this.tax = new Tax(calcFedTax(), clacProTax(), calcTotalTax());
        this.finalPrice = calcFinalPrice(); 
    }
    
    public double calcPriceWithDiscount(){
        if (customer.getVipLevel() == 0) {
            return orignalPrice;
        }
        if (customer.getVipLevel() == 1) {
            return orignalPrice * 0.95;
        }
        if (customer.getVipLevel() == 2) {
            return orignalPrice * 0.9;
        }
        else{
            return orignalPrice * 0.85;
        }
    }
    
    public double calcFedTax(){
        return discountedPrice * 0.05;
    }
    
    public double clacProTax(){
        return discountedPrice * 0.1;
    }
    
    public double calcTotalTax(){
        return discountedPrice * 0.15;
    }
    
    public double calcFinalPrice() {
        return discountedPrice + tax.getTotalTax();
    }
    
    public int updatePoints() {
        return (int) (customer.getPoint() + Math.floor(finalPrice % 10));
    }
    
    public boolean equals(Combo combo, Customer customer, double originalPrice,
            double discountedPrice, Tax tax, double finalPrice){
        return this.combo.equals(combo) && this.customer.equals(customer) &&
                this.discountedPrice == discountedPrice && this.orignalPrice ==
                originalPrice && this.tax.equals(tax) && this.finalPrice == finalPrice;
    }
    
    @Override
    public String toString(){
        String str = "";
        
        str += combo.toString();
        str += "****************************************\n";
        str += String.format("%-30s: %s - L%s\n", "Customer", customer.getCustomerId(),
                customer.getVipLevel());
        str += String.format("%-30s: %.2f\n", "Original Price", orignalPrice);
        str += String.format("%-30s: %.2f\n", "Discounted Price", discountedPrice);
        str += tax.toString();
        str += "----------------------------------------\n";
        str += String.format("%-30s: %.2f\n", "Final Price", finalPrice);
        
        return str;
    }

    public Combo getCombo() {
        return combo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getOrignalPrice() {
        return orignalPrice;
    }

    public Tax getTax() {
        return tax;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setOrignalPrice(double orignalPrice) {
        this.orignalPrice = orignalPrice;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }
}
