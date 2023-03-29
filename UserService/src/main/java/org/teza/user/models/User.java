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

@Entity
@Getter
@Setter
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

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
}
