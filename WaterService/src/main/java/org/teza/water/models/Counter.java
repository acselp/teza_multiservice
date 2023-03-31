package org.teza.water.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//@Entity
@Setter
@Getter
@Table(name = "counters")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @Column(nullable = false)
    private int value;

    @Column(nullable = false, name = "bar_code")
    private String barCode;

    @Basic
    @Column(nullable = false)
    @CreationTimestamp
    private java.util.Date createdAt;

    @Basic
    @Column(nullable = false)
    @UpdateTimestamp
    private java.util.Date updatedAt;
}
