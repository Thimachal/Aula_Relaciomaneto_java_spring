package com.exemple1.exemple1.Controllers;

import com.exemple1.exemple1.Models.Post;
import com.exemple1.exemple1.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService actionPostService;

    @GetMapping("/")
    public ResponseEntity<?> allPosts() {
        try {
            return new ResponseEntity<>(actionPostService.postAll().getBody(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/")
    public ResponseEntity<?> register(@RequestBody Post postFromFront){
        try{
            ResponseEntity<?> clientFromService = actionPostService.resgisterService(postFromFront);
            return new ResponseEntity<>(clientFromService.getBody(),HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
