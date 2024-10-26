package com.ps.alpha.expensemgmt.controllers;

import com.ps.alpha.expensemgmt.beans.Expense;
import com.ps.alpha.expensemgmt.services.ports.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {"/expense"})
public class ExpenseController {

    private ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/home")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpense(@PathVariable("id") long id) {
        return ResponseEntity.ok(expenseService.getExpense(id));
    }

    @GetMapping()
    public ResponseEntity<List<Expense>> getExpenses() {
        return ResponseEntity.ok(expenseService.getExpenses());
    }

    @PostMapping
    public ResponseEntity<Expense> save(@RequestBody Expense expense) {
        return ResponseEntity.ok(expenseService.save(expense));
    }


}
