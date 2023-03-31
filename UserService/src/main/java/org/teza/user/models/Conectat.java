package org.teza.user.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Setter
@Getter
@Table(name = "conectati")
public class Conectat {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User user;

    @Basic
    @Column(nullable = false)
    @CreationTimestamp
    private java.util.Date createdAt;

    @Basic
    @Column(nullable = false)
    @UpdateTimestamp
    private java.util.Date updatedAt;

}
