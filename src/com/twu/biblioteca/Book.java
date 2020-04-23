package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean available = true;

    public Book(String title, String author, int year) {
        //constructor
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String toString(){
        return title + ", " + author + ", " + year + "\n";
    }

    public String getTitle(){
        return title;
    }
    public boolean getStatus(){
        return available;
    }

    public void checkout() throws InvalidBookException {
        if(available){
            this.available = false;
        }
        else throw new InvalidBookException("Book is already checked out.");
    }

    public void checkIn() throws InvalidBookException {
        if(!available){
            this.available = true;
        }
        else throw new InvalidBookException("Book is not checked out.");
    }
}
