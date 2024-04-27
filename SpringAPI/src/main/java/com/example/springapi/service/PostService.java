package com.example.springapi.service;

import com.example.springapi.api.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    // Dummy list to store posts (replace with database interaction)
    private List<Post> posts = new ArrayList<>();

    public String createPost(int userID, String postBody) {
        // Check if user exists (replace with actual user existence check)
        if (!userExists(userID)) {
            return "User does not exist";
        }

        // Create new post
        Post post = new Post();
        post.setPostID(posts.size() + 1); // Generate unique post ID
        post.setPostBody(postBody);
        post.setDate(new Date());
        post.setComments(new ArrayList<>()); // Initialize comments list

        posts.add(post); // Add post to the list
        return "Post created successfully";
    }

    public Post getPost(int postID) {
        // Find post by ID
        for (Post post : posts) {
            if (post.getPostID() == postID) {
                return post;
            }
        }
        return null; // Post not found
    }

    public String editPost(int postID, String newPostBody) {
        // Find post by ID
        for (Post post : posts) {
            if (post.getPostID() == postID) {
                // Update post body
                post.setPostBody(newPostBody);
                return "Post edited successfully";
            }
        }
        return "Post does not exist";
    }

    public String deletePost(int postID) {
        // Find post by ID
        for (Post post : posts) {
            if (post.getPostID() == postID) {
                posts.remove(post);
                return "Post deleted";
            }
        }
        return "Post does not exist";
    }

    private boolean userExists(int userID) {
        // Dummy method to check if user exists (replace with actual user existence check)
        return true;
    }
}
