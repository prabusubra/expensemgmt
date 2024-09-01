package com.ps.alpha.expensemgmt.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Expense {

    @Id
    private long id;
    private String name;
    private double amount;
    private String comments;
    private Category category;
    private String type; //todo: enum
    private int frequency;
    private LocalDateTime createdAt;
    private boolean isRecurring;
    private Person userId;
}
