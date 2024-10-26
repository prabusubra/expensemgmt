package com.ps.alpha.expensemgmt.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Category {
    @Id
    private long id;
    private String name;
    private int type;

    @OneToMany(mappedBy = "category")
    private Set<Expense> expense;
}
