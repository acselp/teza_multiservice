package org.teza.user.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @JsonIgnore
    @ManyToMany(mappedBy = "userRoles")
    private Set<User> users = new HashSet<>();

    @Column(nullable = false)
    private String title;
}
