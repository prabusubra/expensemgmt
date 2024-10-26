package com.ps.alpha.expensemgmt.services;

import com.ps.alpha.expensemgmt.beans.Expense;
import com.ps.alpha.expensemgmt.repos.ExpenseRepo;
import com.ps.alpha.expensemgmt.services.ports.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseRepo expenseRepo;

    @Autowired
    public ExpenseServiceImpl(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }
    @Override
    public Expense getExpense(long id) {
        return expenseRepo.findById(id).get();
    }

    @Override
    public List<Expense> getExpenses() {
        return expenseRepo.findAll();
    }

    @Override
    public Expense save(Expense expense) {
        return expenseRepo.save(expense);
    }
}
