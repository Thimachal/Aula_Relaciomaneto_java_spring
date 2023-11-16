package com.exemple1.exemple1.Services;

import com.exemple1.exemple1.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostService {
    @Autowired
    private PostRepository actionPostRepository;

    public void postAll(){
        actionPostRepository.findAll();
    }
}
