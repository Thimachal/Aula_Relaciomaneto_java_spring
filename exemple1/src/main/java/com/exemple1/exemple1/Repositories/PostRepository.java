package com.exemple1.exemple1.Repositories;

import com.exemple1.exemple1.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
