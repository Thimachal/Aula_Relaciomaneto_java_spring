package com.exemple1.exemple1.Repositories;

import com.exemple1.exemple1.Models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {

    List<Post> findAll();
}
