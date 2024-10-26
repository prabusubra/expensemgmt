package com.ps.alpha.expensemgmt.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
public class Person {
    @Id
    private long id;
    private String userName;
    private String emailId;
    private String role;
    private String passwordHash;
    private LocalDateTime createdAt;
    @OneToMany
    private Set<Expense> expense;
}
