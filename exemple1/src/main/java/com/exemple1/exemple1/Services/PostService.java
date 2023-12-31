package com.exemple1.exemple1.Services;

import com.exemple1.exemple1.Models.Post;
import com.exemple1.exemple1.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository actionPostRepository;

    public ResponseEntity<?> postAll(){
        return ResponseEntity.ok(actionPostRepository.findAll());
    }

    public ResponseEntity<?> resgisterService(Post postFromFront) {
        Post resquestService = actionPostRepository.save(postFromFront);
        return ResponseEntity.ok(resquestService);
    }
}
