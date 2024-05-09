package com.sreekar.security.repository;

import com.sreekar.security.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByDesc(String desc);

    List<Post> findByExp(int exp);

    List<Post> findByExpGreaterThanEqualOrderByExpAsc(int exp);


}