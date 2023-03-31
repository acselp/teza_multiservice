package org.teza.water.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "water_costumer")
public class WaterCostumer {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_user_id")
//    private User user;

//    @OneToMany
//    @JoinColumn(name = "fk_counter_id")
//    private Counter counter;

    @Basic
    @Column(nullable = false)
    @CreationTimestamp
    private java.util.Date createdAt;

    @Basic
    @Column(nullable = false)
    @UpdateTimestamp
    private java.util.Date updatedAt;
}
