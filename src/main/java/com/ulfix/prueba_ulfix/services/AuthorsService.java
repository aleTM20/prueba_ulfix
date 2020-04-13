package com.ulfix.prueba_ulfix.services;

import com.ulfix.prueba_ulfix.models.Authors;

import java.util.List;

public interface AuthorsService {

    List<Authors> listar();
    Authors listarId(int id);
    Authors add(Authors authors);
    Authors edit(Authors authors);
    Authors delete(int id);
}
