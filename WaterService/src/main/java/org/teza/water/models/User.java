package org.teza.water.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Table(name="users")
public class User {
    private int id;

    private Set<Role> userRoles = new HashSet<>();

    private String fname;

    private String lname;

    private String email;

    private String password;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

    public void addRole(Role role) {
        userRoles.add(role);
    }
}
