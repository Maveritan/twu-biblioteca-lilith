package com.twu.biblioteca;

public class InvalidBookException  extends RuntimeException{
    public InvalidBookException(String errorMessage) {
        super(errorMessage);
    }
}
