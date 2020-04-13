package com.ulfix.prueba_ulfix.services;

import com.ulfix.prueba_ulfix.models.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listar();
    Category listarId(int id);
    Category add(Category category);
    Category edit(Category category);
    Category delete(int id);
}
