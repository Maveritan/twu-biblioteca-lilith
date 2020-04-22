package com.twu.biblioteca;

public class invalidBookException extends RuntimeException{
    public invalidBookException(String errorMessage) {
        super(errorMessage);
    }
}
