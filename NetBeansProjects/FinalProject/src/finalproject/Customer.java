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
public class Customer {
    private String customerId;
    private String name;
    private int vipLevel;
    private int point;
    private static int nextId = 1;
    
    public Customer(){
        this.customerId = String.format("C%03d", generateId());
        this.name = null;
        this.point = 0;
        this.vipLevel = 0;
    }
    
    public Customer(String name, int vipLevel, int point){
        this.customerId = String.format("C%03d", generateId());
        this.name = name;
        this.vipLevel = vipLevel;
        this.point = point;
    }
    
    public Customer(Customer customer){
        this.customerId = customer.customerId;
        this.name = customer.name;
        this.point = customer.point;
        this.vipLevel = customer.vipLevel;
    }
    
    public static int generateId(){
        return nextId++;
    }
    
    public void updateId(){
        if (point >= 50 && vipLevel == 0) {
            vipLevel++;
            point -= 50;
        }
        if (point >= 80 && vipLevel == 1){
            vipLevel++;
            point -= 80;
        }
        if (point >= 100 && vipLevel == 2) {
            vipLevel++;
            point -= 100;
        }
    }
    
    public boolean equals(Customer customer){
        return this.customerId.endsWith(customer.customerId) && 
                this.name.equals(customer.name) && this.point == customer.point 
                && this.vipLevel == customer.vipLevel;
    }
    
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%-20s: %s\n", "Customer ID", customerId);
        str += String.format("%-20s: %s\n", "Name", name);
        str += String.format("%-20s: %s\n", "VIP Level", vipLevel);
        str += String.format("%-20s: %s\n", "Points", point);
        
        return str;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getPoint() {
        return point;
    }

    public int getVipLevel() {
        return vipLevel;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNextId(int nextId) {
        Customer.nextId = nextId;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }
}
