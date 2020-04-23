package com.twu.biblioteca;

public class InvalidUserException extends RuntimeException{
    public InvalidUserException(String errorMessage) {
        super(errorMessage);
    }
}
