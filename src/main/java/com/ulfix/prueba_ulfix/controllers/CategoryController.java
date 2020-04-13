package com.ulfix.prueba_ulfix.controllers;


import com.ulfix.prueba_ulfix.models.Category;
import com.ulfix.prueba_ulfix.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/category"})
public class CategoryController {

    @Autowired
    CategoryService authorsService;

    @GetMapping
    public List<Category> listar(){
        return authorsService.listar();
    }
    @PostMapping
    public Category agregar(@RequestBody Category p){
        return authorsService.add(p);
    }
    @GetMapping(path = {"findById/{id}"})
    public Category listarId(@PathVariable("id")int id){
        return authorsService.listarId(id);
    }
    @PutMapping(path = {"update/{id}"})
    public Category editar(@RequestBody Category p,@PathVariable("id") int id){
        p.setId(id);
        return authorsService.edit(p);
    }
    @DeleteMapping(path = {"delete/{id}"})
    public Category delete(@PathVariable("id") int  id){
        return authorsService.delete(id);
    }
}
