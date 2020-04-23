package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AuthenticationTest {
    User user = new User("name","pass");

    @Test
    public void correctCredentialsLoginSuccessfully(){
        AssertEquals(user, Accounts.authenticate("name","pass"));
    }

    @Test (expected = InvalidUserException.class)
    public void incorrectUsernameFailsAuthentication(){
        Accounts.authenticate("notname","pass");
    }

    @Test (expected = InvalidUserException.class)
    public void incorrectPasswordFailsAuthentication(){
        Accounts.authenticate("name","notpass");
    }

    @Test (expected = InvalidUserException.class)
    public void incorrectUserPassFailsAuthentication(){
        Accounts.authenticate("notname","notpass");
    }
}
