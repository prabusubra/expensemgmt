package com.ps.alpha.expensemgmt.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class Expense {

    @Id
    private long id;
    private String name;
    private double amount;
    private String comments;

    @ManyToOne
    private Category category;
    private String type; //todo: enum
    private int frequency;
    private LocalDateTime createdAt;
    private boolean isRecurring;

    @ManyToOne
    private Person userId;
}
