package com.ps.alpha.expensemgmt.services.ports;

import com.ps.alpha.expensemgmt.beans.Category;

import java.util.List;

public interface CategoryService {

    public Category getCategory(long id);
    public List<Category> getCategories();
    public Category save(Category category);
}
