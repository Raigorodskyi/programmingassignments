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
public class Tax {
    private double fedTax;
    private double proTax;
    private double totalTax;

    public Tax() {
        this.fedTax = 0;
        this.proTax = 0;
        this.totalTax = 0;
    }

    public Tax(double fedTax, double proTax, double totalTax) {
        this.fedTax = fedTax;
        this.proTax = proTax;
        this.totalTax = totalTax;
    }
    
    public Tax(Tax tax){
        this.fedTax = tax.fedTax;
        this.proTax = tax.proTax;
        this.totalTax = tax.totalTax;
    }
    
    public boolean equals(Tax tax){
        return this.fedTax == tax.fedTax && this.proTax == tax.proTax &&
                this.totalTax == tax.totalTax;
    }
    
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%-30s: %.2f\n", "Fed Tax", fedTax);
        str += String.format("%-30s: %.2f\n", "Pro Tax", proTax);
        str += String.format("%-30s: %.2f\n", "Total Tax", totalTax);
        
        return str;
    }

    public double getFedTax() {
        return fedTax;
    }

    public double getProTax() {
        return proTax;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setFedTax(double fedTax) {
        this.fedTax = fedTax;
    }

    public void setProTax(double proTax) {
        this.proTax = proTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }
}
