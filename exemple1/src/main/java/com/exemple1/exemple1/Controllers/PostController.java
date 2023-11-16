package com.exemple1.exemple1.Controllers;

import com.exemple1.exemple1.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService actionPostService;

    @GetMapping("/")
    public ResponseEntity<?> classallPosts() {
        try {
            var request = actionPostService.postAll();
            return new ResponseEntity<>(request, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
