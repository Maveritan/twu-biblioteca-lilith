package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book b = new Book("Outspoken", "Julia Serano", 2016);

    @Test
    public void toStringOutputsAsExpected(){
        String s1 = b.toString();
        String s2 = "Outspoken, Julia Serano, 2016\n";
        assertEquals(s1,s2);
    }

    @Test
    public void canCheckoutBook() {
            b.checkout(); //checkout default is available so should succeed
    }


    @Test (expected = InvalidBookException.class)
    public void cantCheckoutBookTwice(){
        b.checkout(); //checkout book
        b.checkout(); //try to checkout again - should fail and throw exception
    }

    @Test (expected = InvalidBookException.class)
    public void cantReturnAvailableBook() {
        b.checkIn();
    }
    @Test
    public void canReturnBook() {
        b.checkout();
        b.checkIn();
    }
}
