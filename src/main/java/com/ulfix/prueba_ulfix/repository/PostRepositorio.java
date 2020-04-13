package com.ulfix.prueba_ulfix.repository;

import com.ulfix.prueba_ulfix.models.Post;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PostRepositorio extends Repository<Post,Integer> {

    List<Post> findAll();
    Post findById(int id);
    Post save(Post posts);
    void delete(Post post);
}
