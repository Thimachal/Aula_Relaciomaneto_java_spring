package com.exemple1.exemple1.Controllers;

import com.exemple1.exemple1.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private PostService actionPostService;

    @GetMapping("/posts")
    public void classallPosts(){
        actionPostService.postAll();
    }
}
