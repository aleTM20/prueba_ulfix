package com.ulfix.prueba_ulfix;

import com.ulfix.prueba_ulfix.models.Authors;
import com.ulfix.prueba_ulfix.repository.AuthorsRepositorio;
import com.ulfix.prueba_ulfix.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsServiceImp implements AuthorsService {
    @Autowired
    AuthorsRepositorio repositorio;

    @Override
    public List<Authors> listar() {
        return repositorio.findAll();
    }

    @Override
    public Authors listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Authors add(Authors authors) {
        return repositorio.save(authors);
    }

    @Override
    public Authors edit(Authors authors) {
        return repositorio.save(authors);
    }

    @Override
    public Authors delete(int id) {
        Authors authors = repositorio.findById(id);
        if(authors!=null){
            repositorio.delete(authors);
        }
        return authors;

    }
}
