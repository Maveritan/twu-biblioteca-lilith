package com.twu.biblioteca;

public class UIStrings {

    public static String Welcome() {
        //message to display on program start
        return "Welcome to Biblioteca. your one-stop-shop for great book titles in Bangalore!\n";
    }
    public static String Menu(){
        //main menu w/ options 1. 2. 3. etc
        return  "Please select from the following:\n" +
                "1.List of books \n" +
                "2.Checkout a book\n" +
                "3.Return a book\n" +
                "4.Quit Biblioteca\n";
    }
    public static String InvalidOptionSelected(){
        return "Please select a valid option!";
    }
    public static String InputTitle(){
        return "Please input the book's title: ";
    }
    public static String CheckoutSuccess(){
        //message to display when book is checked out successfully
        return "Thank You! Enjoy the book.";
    }
    public static String CheckoutFail(){
        //message to display when book is checked out unsuccessfully
        return "Sorry, that book is not available.";
    }
    public static String ReturnSuccess(){
        //message to display when book is returned successfully
        return "Thank you for returning the book.";
    }
    public static String ReturnFail(){
        //message to display when book is returned unsuccessfully
        return "That is not a valid book to return.";
    }
}
