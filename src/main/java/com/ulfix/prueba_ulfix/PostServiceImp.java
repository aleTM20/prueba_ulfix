package com.ulfix.prueba_ulfix;

import com.ulfix.prueba_ulfix.models.Authors;
import com.ulfix.prueba_ulfix.models.Post;
import com.ulfix.prueba_ulfix.repository.PostRepositorio;
import com.ulfix.prueba_ulfix.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImp implements PostService {

    @Autowired
    PostRepositorio repositorio;

    @Override
    public List<Post> listar() {
        return repositorio.findAll();
    }

    @Override
    public Post listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Post add(Post post) {
        return repositorio.save(post);
    }

    @Override
    public Post edit(Post post) {
        return repositorio.save(post);
    }

    @Override
    public Post delete(int id) {
        Post post = repositorio.findById(id);
        if(post!=null){
            repositorio.delete(post);
        }
        return post;

    }
}