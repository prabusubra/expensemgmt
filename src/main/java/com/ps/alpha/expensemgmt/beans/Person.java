package com.ps.alpha.expensemgmt.beans;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String emailId;
    private String role;
    private String passwordHash;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Expense> expense;
}
