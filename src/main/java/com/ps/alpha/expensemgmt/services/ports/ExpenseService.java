package com.ps.alpha.expensemgmt.services.ports;

import com.ps.alpha.expensemgmt.beans.Expense;

import java.util.List;

public interface ExpenseService {
    public Expense getExpense(long id);

    public List<Expense> getExpenses();

    public Expense save(Expense expense);
}
