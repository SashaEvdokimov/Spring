package com.springapp.exceptions;

public class UserAlreadyExists extends RuntimeException {

    public UserAlreadyExists(){
        super("User already exists");
    }
}
