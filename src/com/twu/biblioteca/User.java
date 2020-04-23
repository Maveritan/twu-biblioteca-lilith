package com.twu.biblioteca;

public class User {
    private String username;
    private String password;
    private boolean librarian = false;

    public User(String username, String password) {
        //constructor
        this.username = username;
        this.password = password;
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
