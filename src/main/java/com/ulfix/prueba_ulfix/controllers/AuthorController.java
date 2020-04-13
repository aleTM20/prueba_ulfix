package com.ulfix.prueba_ulfix.controllers;


import com.ulfix.prueba_ulfix.services.AuthorsService;
import com.ulfix.prueba_ulfix.models.Authors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/authors"})
public class AuthorController {

    @Autowired
    AuthorsService authorsService;

    @GetMapping
    public List<Authors> listar(){
        return authorsService.listar();
    }
    @PostMapping
    public Authors agregar(@RequestBody Authors p){
        return authorsService.add(p);
    }
    @GetMapping(path = {"findById/{id}"})
    public Authors listarId(@PathVariable("id")int id){
        return authorsService.listarId(id);
    }
    @PutMapping(path = {"update/{id}"})
    public Authors editar(@RequestBody Authors p,@PathVariable("id") int id){
        p.setId(id);
        return authorsService.edit(p);
    }
    @DeleteMapping(path = {"delete/{id}"})
    public Authors delete(@PathVariable("id") int  id){
        return authorsService.delete(id);
    }
}
