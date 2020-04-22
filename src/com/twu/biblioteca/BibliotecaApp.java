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
        System.out.println(UIStrings.welcome());
        while (mainLoop) {
            System.out.print(UIStrings.menu());

            int selection = in.nextInt();
            switch (selection) {
                case 1: //list all books
                    System.out.println(catalogue.toString());
                    break;
                case 2: //checkout book
                    System.out.println(catalogue.checkout());
                    break;
                case 3: //return book
                    System.out.println(catalogue.checkin());
                    break;
                case 4: //quit application
                    mainLoop = false; //main loop bool to close, breaks loop and exit code executes
                    break;
                default:
                    System.out.println(UIStrings.invalidOptionSelected());
                    break;
            }
        }
        System.exit(0);
    }
}
