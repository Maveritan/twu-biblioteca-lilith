package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Assert;

public class UserTest {
    User user = new User("name","pass");

    @Test
    public void correctPasswordReturnsTrue(){
        Assert.assertTrue(user.checkPassword("pass"));
    }

    @Test
    public void incorrectPasswordReturnsFalse(){
        Assert.assertFalse(user.checkPassword("notpass"));
    }

    @Test
    public void nullPasswordReturnsFalse(){
        Assert.assertFalse(user.checkPassword(null));
    }
}
