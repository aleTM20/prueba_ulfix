package com.ulfix.prueba_ulfix.services;

import com.ulfix.prueba_ulfix.models.Post;

import java.util.List;

public interface PostService {

    List<Post> listar();
    Post listarId(int id);
    Post add(Post post);
    Post edit(Post post);
    Post delete(int id);
}
