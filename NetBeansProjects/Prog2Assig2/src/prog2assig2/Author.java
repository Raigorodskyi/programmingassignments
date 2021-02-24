/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2assig2;

/**
 *
 * @author Igor Raigorodskyi
 */
public class Author {
    
    private String name;
    private String nationality;
    private String email;

    public static final String[] NATIONALITIES = {"Canadian", "American", "French", "British", "German"};
    
    public Author() {
        this.name = null;
        this.nationality = null;
        this.email = null;
    }
    
    public Author(String name, String natioanlity, String email) {
        this.name = name;
        
        if (isNationalityValid(natioanlity)) {
            this.nationality = natioanlity;
        } else {
            this.nationality = NATIONALITIES[0];
        }
        
        this.email = email;
    }
    
    public Author(Author author) {
        this.name = author.name;
        this.nationality = author.nationality;
        this.email = author.email;
    }
    
    public static boolean isNationalityValid(String nationality) {
        for (String nation : NATIONALITIES) {
            if (nation.equalsIgnoreCase(nationality)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean equals(Author author) {
        return this.name.equalsIgnoreCase(author.name) && this.nationality.equalsIgnoreCase(author.nationality)
                && this.email.equalsIgnoreCase(author.email);
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-13s : %s\n", "Name", this.name);
        str += String.format("%-13s : %s\n", "Nationality", this.nationality);
        str += String.format("%-13s : %s\n", "Email", this.email);
        
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNatioanlity() {
        return nationality;
    }

    public void setNatioanlity(String natioanlity) {
        if (isNationalityValid(natioanlity)) {
         this.nationality = natioanlity;   
        } else {
            this.nationality = NATIONALITIES[0];
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
