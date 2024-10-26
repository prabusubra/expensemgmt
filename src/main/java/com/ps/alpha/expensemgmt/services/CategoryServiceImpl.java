package com.ps.alpha.expensemgmt.services;

import com.ps.alpha.expensemgmt.beans.Category;
import com.ps.alpha.expensemgmt.repos.CategoryRepo;
import com.ps.alpha.expensemgmt.services.ports.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category getCategory(long id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepo.save(category);
    }
}
