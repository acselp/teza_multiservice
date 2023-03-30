package org.teza.user.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import reactor.util.annotation.NonNullApi;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name="role_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    @Column(nullable = false)
    private Set<Role> userRoles = new HashSet<>();

    @Column(nullable = false)
    private String fname;

    @Column(nullable = false)
    private String lname;

    @Email
    @Column(nullable = false, unique=true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Basic
    @Column(nullable = false)
    @CreationTimestamp
    private java.util.Date createdAt;

    @Basic
    @Column(nullable = false)
    @UpdateTimestamp
    private java.util.Date updatedAt;

    public void addRole(Role role) {
        userRoles.add(role);
    }
}
