package com.example.springapi.api.controller;

import com.example.springapi.api.model.Post;
import com.example.springapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public String createPost(@RequestParam int userID, @RequestParam String postBody) {
        return postService.createPost(userID, postBody);
    }

    @GetMapping
    public Post getPost(@RequestParam int postID) {
        return postService.getPost(postID);
    }

    @PatchMapping
    public String editPost(@RequestParam int postID, @RequestParam String newPostBody) {
        return postService.editPost(postID, newPostBody);
    }

    @DeleteMapping
    public String deletePost(@RequestParam int postID) {
        return postService.deletePost(postID);
    }
}
