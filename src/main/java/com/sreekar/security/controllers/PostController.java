package com.sreekar.security.controllers;

import com.sreekar.security.model.Post;
import com.sreekar.security.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostRepository repo;

    @GetMapping(value = "/posts")
    public ResponseEntity<List<Post>> getAllPosts () {
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping(value = "/posts/desc/{desc}")
    public ResponseEntity<List<Post>> getPostByDesc(@PathVariable String desc){
        return ResponseEntity.ok(repo.findByDesc(desc));
    }

    @GetMapping(value = "/posts/exp/{exp}")
    public ResponseEntity<List<Post>> getPostByExp(@PathVariable int exp){
        return ResponseEntity.ok(repo.findByExp(exp));
    }

    @GetMapping(value = "/posts/exp/")
    public ResponseEntity<List<Post>> getPostByExpGreaterThan(@RequestParam("exp") int exp){
        return ResponseEntity.ok(repo.findByExpGreaterThanEqualOrderByExpAsc(exp));
    }

}