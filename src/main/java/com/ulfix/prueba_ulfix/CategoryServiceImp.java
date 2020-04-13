package com.ulfix.prueba_ulfix;

import com.ulfix.prueba_ulfix.models.Category;
import com.ulfix.prueba_ulfix.models.Post;
import com.ulfix.prueba_ulfix.repository.CategoryRepositorio;
import com.ulfix.prueba_ulfix.repository.PostRepositorio;
import com.ulfix.prueba_ulfix.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryRepositorio repositorio;

    @Override
    public List<Category> listar() {
        return repositorio.findAll();
    }

    @Override
    public Category listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Category add(Category category) {
        return repositorio.save(category);
    }

    @Override
    public Category edit(Category category) {
        return repositorio.save(category);
    }

    @Override
    public Category delete(int id) {
        Category category = repositorio.findById(id);
        if(category!=null){
            repositorio.delete(category);
        }
        return category;

    }
}