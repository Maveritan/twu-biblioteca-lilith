package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        //Define scanner object
        Scanner in = new Scanner(System.in);
        //create catalogue w/ default books
        Catalogue catalogue = new Catalogue();

        //boolean for controlling menu loop
        boolean mainLoop = true;

        //Display Welcome and Menu
        System.out.println(UIStrings.Welcome());
        while (mainLoop) {
            System.out.print(UIStrings.Menu());

            int selection = in.nextInt();
            switch (selection) {
                case 1: //list all books
                    System.out.println(catalogue.toString());
                    break;
                case 2: //checkout book
                    break;
                case 3: //return book
                    break;
                case 4: //quit application
                    System.exit(0);
                default:
                    System.out.println(UIStrings.InvalidOptionSelected());
                    break;
            }
        }
    }

    String Checkout(Book book){
        try{
            book.Checkout();
            return UIStrings.CheckoutSuccess();
        }
        catch (InvalidBookException e) {
            return UIStrings.CheckoutFail();
        }
    }

    String Return(Book book){
        try{
            book.Return();
            return UIStrings.ReturnSuccess();
        }
        catch (InvalidBookException e) {
            return UIStrings.ReturnFail();
        }
    }

}
