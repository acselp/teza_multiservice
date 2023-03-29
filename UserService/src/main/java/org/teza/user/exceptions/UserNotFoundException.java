package org.teza.user.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(int id) {
        super("User with id " + id + " not found.");
    }
}
