package com.ulfix.prueba_ulfix.repository;

import com.ulfix.prueba_ulfix.models.Category;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CategoryRepositorio extends Repository<Category,Integer> {

    List<Category> findAll();
    Category findById(int id);
    Category save(Category Categories);
    void delete(Category category);
}
