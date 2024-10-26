package com.ps.alpha.expensemgmt.repos;

import com.ps.alpha.expensemgmt.beans.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense, Long> {
}
