package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book b = new Book("Outspoken", "Julia Serano", 2016);

    @Test
    public void CreateTest(){
        String s1 = b.toString();
        String s2 = "Outspoken, Julia Serano, 2016\n";
        assertEquals(s1,s2);
    }

    @Test
    public void CheckoutTestFromDefault() {
        //test of checkout method
        boolean thrown;
        try {
            b.Checkout(); //checkout default is available so should succeed
            thrown = false;
        }
        catch (InvalidBookException e){
            thrown = true;
        }
        assertFalse(thrown);

        try {
            b.Checkout(); //try to checkout again - should fail and throw exception
            thrown = false;
        }
        catch (InvalidBookException e){
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void ReturnTestFromDefault() {
        boolean thrown;
        try {
            //book defaults to available - should throw exception
            b.Return();
            thrown = false;
        }
        catch (InvalidBookException e){
            thrown = true;
        }
        assertTrue(thrown);
        b.Checkout(); //checkout
        try {
            //should pass now without exception
            b.Return();
            thrown = false;
        }
        catch (InvalidBookException e){
            thrown = true;
        }
        assertFalse(thrown);

    }
}
