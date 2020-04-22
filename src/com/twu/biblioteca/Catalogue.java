package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogue {
    //responsible for enumeration of book objects
    //initial library of available books - things I had within arm's reach
    //very quick and dirty
    ArrayList<Book> cat = new ArrayList<Book>();
    Book b1 = new Book("Outspoken", "Julia Serano", 2016);
    Book b2 = new Book("The Tea Dragon Society", "Katie O'Neill", 2017);
    Book b3 = new Book("Wandering Son (Volume One)", "Shimura Takako", 2011);
    Book b4 = new Book("My Friend Took Me To A Feline Therapy Place For My Anxiety And I'm Starting To Wonder Where The Cats Are?", "Alex Zandra Van Chestein", 2018);

    public Catalogue(){
        //constructor
        cat.add(b1);
        cat.add(b2);
        cat.add(b3);
        cat.add(b4);
    }

    public String toString(){
        //returns list of all books in catalogue
        StringBuilder s = new StringBuilder();
        for(Book element : cat) {
            if(element.getStatus()) {
                s.append(element.toString());
            }
        }
        return s.toString();
    }

    public String checkout(){
        String title = inputBookTitle();
        int index = findBook(title);

        try{
            cat.get(index).checkout();
            return UIStrings.checkoutSuccess();
        }
        catch(Exception e){
            return UIStrings.checkoutFail();
        }
    }

    public String checkin(){
        String title = inputBookTitle();
        int index = findBook(title);

        try{
            cat.get(index).checkin();
            return UIStrings.returnSuccess();
        }
        catch(Exception e){
            return UIStrings.returnFail();
        }
    }

    String inputBookTitle(){
        Scanner in = new Scanner(System.in);
        System.out.print(UIStrings.inputTitle());
        return in.nextLine();
    }

    int findBook(String title){
        //find index of book that matches title given
        for(int i = 0; i < cat.size(); i++){
            Book b = cat.get(i);
            if (b.getTitle().equals(title)){
                return i;
            }
        }
        //default return
        return -1;
    }
}
