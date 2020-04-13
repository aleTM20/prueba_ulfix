package com.ulfix.prueba_ulfix.controllers;


import com.ulfix.prueba_ulfix.models.Post;
import com.ulfix.prueba_ulfix.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/post"})
public class PostController {

    @Autowired
    PostService authorsService;

    @GetMapping
    public List<Post> listar(){
        return authorsService.listar();
    }
    @PostMapping
    public Post agregar(@RequestBody Post p){
        return authorsService.add(p);
    }
    @GetMapping(path = {"findById/{id}"})
    public Post listarId(@PathVariable("id")int id){
        return authorsService.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Post editar(@RequestBody Post p,@PathVariable("id") int id){
        p.setId(id);
        return authorsService.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Post delete(@PathVariable("id") int  id){
        return authorsService.delete(id);
    }
}
