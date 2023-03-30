package org.teza.user.exceptions;

public class RoleNotFoundException extends Exception{
    public RoleNotFoundException(int id) {
        super("Role with id " + id + " not found.");
    }
}
