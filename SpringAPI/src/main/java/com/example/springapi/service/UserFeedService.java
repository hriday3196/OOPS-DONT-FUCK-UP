package com.example.springapi.service;

import com.example.springapi.api.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserFeedService {

    public List<Post> getUserFeed() {
        // This method should contain logic to retrieve posts from a database or any other data source

        // For demonstration, let's create some sample posts
        List<Post> posts = new ArrayList<>();

        // Post 1
        Post post1 = new Post();
        post1.setPostID(1);
        post1.setPostBody("This is the first post.");
        post1.setDate(new Date());
        post1.setComments(new ArrayList<>()); // Empty list of comments for now

        // Post 2
        Post post2 = new Post();
        post2.setPostID(2);
        post2.setPostBody("This is the second post.");
        post2.setDate(new Date());
        post2.setComments(new ArrayList<>()); // Empty list of comments for now

        // Add posts to the list
        posts.add(post1);
        posts.add(post2);

        return posts;
    }
}
