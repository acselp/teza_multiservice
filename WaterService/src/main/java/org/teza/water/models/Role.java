package org.teza.water.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Role {

    private int id;

    private Set<User> users = new HashSet<>();

    private String title;
}
