package com.ps.alpha.expensemgmt.loaders;

import com.ps.alpha.expensemgmt.beans.Category;
import com.ps.alpha.expensemgmt.services.ports.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoriesLoader implements CommandLineRunner {

    private CategoryService categoryService;

    @Autowired
    public CategoriesLoader(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category(1, "Food", 1);
        Category category2 = new Category(2, "Transport", 2);
        Category category3 = new Category(3, "Utilities", 3);
        categoryService.save(category1);
        categoryService.save(category2);
        categoryService.save(category3);
    }
}
