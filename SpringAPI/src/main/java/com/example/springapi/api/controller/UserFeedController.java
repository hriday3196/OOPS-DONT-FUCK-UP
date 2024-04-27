package com.example.springapi.api.controller;

import com.example.springapi.api.model.Post;
import com.example.springapi.service.UserFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserFeedController {

    private final UserFeedService userFeedService;

    @Autowired
    public UserFeedController(UserFeedService userFeedService) {
        this.userFeedService = userFeedService;
    }

    @GetMapping("/")
    public List<Post> getUserFeed() {
        return userFeedService.getUserFeed();
    }
}
