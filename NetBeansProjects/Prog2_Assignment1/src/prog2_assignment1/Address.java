/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2_assignment1;
/**
 *
 * @author Igor Raigorodskyi
 */
public class Address {
    private String street;
    private int streetNum;
    private String city;
    private String zipCode;
    
    public Address() {
        this.street = null;
        this.streetNum = 0;
        this.city = null;
        this.zipCode = null;
    }
    
    public Address(String street, int streetNum, String city, String zipCode) {
        this.street = street;
        this.streetNum = streetNum;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    public Address(Address address) {
        this.street = address.street;
        this.streetNum = address.streetNum;
        this.city = address.city;
        this.zipCode = address.zipCode;
    }
    
    public static String toTitleCase(String str) {
        String strToTitle = "";
        for (int i = 0; i < str.length(); i++) {
            String currentChar = str.charAt(i) + "";
            if (i == 0) {
                strToTitle += currentChar.toUpperCase();
            }
            else if (str.charAt(i - 1) == ' ') {
                strToTitle += currentChar.toUpperCase();
            }
            else {
                strToTitle += currentChar.toLowerCase();
            }
        }
        return strToTitle;
    }
    
    public boolean equals(Address address){
        return this.street.equals(address.street) && this.streetNum == address.streetNum
                && this.city.equals(address.city) && this.zipCode.equals(address.zipCode);
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %d, %s\n", "Street", this.streetNum, 
                toTitleCase(this.street));
        str += String.format("%-10s: %s\n", "City", toTitleCase(this.city));
        str += String.format("%-10s: %s\n", "ZipCode", this.zipCode.toUpperCase());
        
        return str;
    }

    public String getCity() {
        return toTitleCase(city);
    }

    public String getStreet() {
        return toTitleCase(street);
    }

    public int getStreetNum() {
        return streetNum;
    }

    public String getZipCode() {
        return zipCode.toUpperCase();
    }

    public void setCity(String city) {
        this.city = toTitleCase(city);
    }

    public void setStreet(String street) {
        this.street = toTitleCase(street);
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode.toUpperCase();
    }
}
