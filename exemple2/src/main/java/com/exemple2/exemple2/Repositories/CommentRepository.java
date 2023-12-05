package com.exemple2.exemple2.Repositories;

import com.exemple2.exemple2.Models.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comments, Long> {
}

