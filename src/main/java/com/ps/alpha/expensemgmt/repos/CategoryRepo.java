package com.ps.alpha.expensemgmt.repos;

import com.ps.alpha.expensemgmt.beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
