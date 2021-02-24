/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2assig2;
import java.util.Random;

/**
 *
 * @author Igor Raigorodskyi
 */
public class MyLibrary {
    private Book[] books;

    public MyLibrary() {
        this.books = null;
    }
    
    public MyLibrary(Book[] books) {
        this.books = books;
    }
    
    public MyLibrary(MyLibrary myLibrary) {
        this.books = myLibrary.books;
    }
    
    public Book selectBook() {
         Random rand = new Random();
         return books[rand.nextInt(books.length)];
    }
    
    public Book selectBook(int num) {
        if (num <= 0 && num < books.length) {
            return books[num];
        } else {
            Random rand = new Random();
            return books[rand.nextInt(books.length)];
        }
    }
    
    public double calcTotalPrice() {
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }
    
    public int countNationality(String nationality) {
        int count = 0;
        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getNatioanlity().equalsIgnoreCase(nationality)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public boolean equals(MyLibrary myLibrary) {
        return this.books == myLibrary.books;
    }
    
    @Override 
    public String toString() {
        String str = "";
        
        for (Book book : books) {
            str += String.format("%s\n", book.toString());
        }
        
        return str;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
