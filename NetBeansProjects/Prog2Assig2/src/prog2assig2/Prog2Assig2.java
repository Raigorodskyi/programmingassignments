/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2assig2;

/**
 *
 * @author 20
 */
public class Prog2Assig2 {
    public static void main(String[] args) {
        Author author = new Author("Taras Shevchenko", "ukrainian", "shevchen1814@gmail.com");
        Author author1 = new Author("Ivan Franko", "British", "frankothebest@gmail.com");
        Author author2 = new Author("Aleksandr Pushkin", "Russian", "russkayalitra@mail.ru");
       // System.out.println(author.toString());
        Author[] authors = {author, author1};
        Author[] authors1 = {author1, author2};
        Author[] authors3 = {author1, author2, author};
        Book book = new Book("Kobzar", authors, 14);
        //System.out.println(book.toString());
        Book book2 = new Book("Ukr/Zarub lit", authors1, 100.096);
       // System.out.println(book2.toString());
        Book book1 = new Book("KulamBeyahad", authors3, 11);
        Book[] books = {book, book1, book2};
        MyLibrary myLibrary = new MyLibrary(books);
        book.setAuthors(authors3);
        System.out.println(myLibrary.toString());
        System.out.println(myLibrary.countNationality("Canadian"));
    }
}
