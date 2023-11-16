package com.exemple1.exemple1.Services;

import com.exemple1.exemple1.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class PostService {
    @Autowired
    private PostRepository actionPostRepository;

    public ResponseEntity<?> postAll(){
        return ResponseEntity.ok(actionPostRepository.findAll());
    }
}
