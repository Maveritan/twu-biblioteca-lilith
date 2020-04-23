package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CatalogueTest {
    Catalogue cat = new Catalogue();

    @Test
    public void catalogueSearchTest(){
        //search for valid book, known at index 0
        int i1 = cat.findBook("Outspoken");
        int i2 = 0;
        assertEquals(i1,i2);
    }

    @Test
    public void shouldNotFindInvalidBook(){
        //search for invalid book
        int i1 = cat.findBook("Sakura Wars");
        int i2 = -1;
        assertEquals(i1,i2);
    }

    @Test
    public void nullSearchReturnsNegativeIndex(){
        int i = cat.findBook(null);
        assertEquals(-1,i);
    }


}
