package com.twu.biblioteca;

import java.util.ArrayList;

public class Accounts {

    static User u1 = new User("user1","pass1");

    public Accounts(){
    }

    public static User authenticate(String username, String password){
        return u1;
    }
}
