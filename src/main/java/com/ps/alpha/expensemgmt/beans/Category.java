package com.ps.alpha.expensemgmt.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Category {
    @Id
    private long id;
    private String name;
    private int type;

    public Category(long id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<Expense> expense;
}
