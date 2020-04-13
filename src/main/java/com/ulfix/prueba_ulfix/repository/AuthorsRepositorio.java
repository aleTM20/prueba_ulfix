package com.ulfix.prueba_ulfix.repository;

import com.ulfix.prueba_ulfix.models.Authors;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AuthorsRepositorio extends Repository<Authors,Integer> {

    List<Authors> findAll();
    Authors findById(int id);
    Authors save(Authors authors);
    void delete(Authors authors);
}
