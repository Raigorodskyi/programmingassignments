/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author 2003i
 */
public class Account {
    private String type;
    private double balance;
    
    public Account(){
        this.type = "c";
        this.balance = 0;
    }
    public Account(String type, int balance){
        this.type = type;
        this.balance = balance;
    }
    public Account(Account account){
        this.type = account.type;
        this.balance = account.balance;
    }
    
    public boolean equals(Account account){
        return this.type == account.type && this.balance == account.balance;
    }
    
    /*@Override
    public String toString(){
        
    }*/
}
