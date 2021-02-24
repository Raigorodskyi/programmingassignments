/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2assig2;

import java.util.Arrays;

/**
 *
 * @author Igor Raigorodskyi
 */
public class Book {
    private String title;
    private Author[] authors;
    private double price;

    public Book() {
        this.title = null;
        //this.authors = null;    //bad idea, code may crush
        this.authors = new Author[2];   //better idea creates 2 empty authors
        this.price = 0;
    }
    
    public Book(String title, Author[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(Book book) {
        this.title = book.title;
        //this.authors = book.authors;        //shalow copy
        this.authors = Arrays.copyOf(book.authors, book.authors.length);    //deep copy
        this.price = book.price;
    }
    
    public boolean equals(Book book) {
        return this.title.equalsIgnoreCase(book.title) && Arrays.equals(this.authors, //equals for arrays keep in mind
                book.authors) && this.price == book.price;
    }
    
    @Override 
    public String toString() {
    String str = "";
    
    str += String.format("%-13s : %s\n", "Title", this.title);
    
    String authorNames = "";
        for (int i = 0; i < authors.length; i++) {
            if (i < authors.length - 1) {
                authorNames += authors[i].getName() + ", ";
            } else {
                authorNames += authors[i].getName();
            }
        }
    str += String.format("%-13s : %s\n", "Author", authorNames);
    str += String.format("%-13s : %.2f\n", "Price", this.price);
    
    return str;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
