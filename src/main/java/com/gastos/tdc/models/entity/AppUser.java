package com.gastos.tdc.models.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table
public class AppUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifyAt;

    @OneToMany(mappedBy = "appUser", cascade = CascadeType.ALL)
    private List<Card> cards;

    @PrePersist
    protected void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.modifyAt = now;
    }

    @PreUpdate
    protected void preUpdate() {
        this.modifyAt = LocalDateTime.now();
    }
}