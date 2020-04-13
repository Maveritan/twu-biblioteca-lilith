package com.twu.biblioteca;

import java.io.InvalidObjectException;

public class Book {

    String title;
    String author;
    int year;
    boolean available = true;

    public Book(String title, String author, int year) {
        //constructor
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String toString(Book b){
        return title + ", " + author + ", " + year + "\n";
    }

    public void Checkout(Book item) throws InvalidBookException {
        if(available){
            this.available = false;
        }
        else throw new InvalidBookException("Book is already checked out.");
    }
}
